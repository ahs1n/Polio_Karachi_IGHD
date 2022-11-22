package edu.aku.dmu.quasi_experimental.ui.sections;

import static edu.aku.dmu.quasi_experimental.core.MainApp.diagnosis;
import static edu.aku.dmu.quasi_experimental.core.MainApp.patientDetails;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.dmu.quasi_experimental.R;
import edu.aku.dmu.quasi_experimental.contracts.TableContract;
import edu.aku.dmu.quasi_experimental.core.MainApp;
import edu.aku.dmu.quasi_experimental.database.DatabaseHelper;
import edu.aku.dmu.quasi_experimental.databinding.ActivitySectionExaminationBinding;
import edu.aku.dmu.quasi_experimental.models.Diagnosis;
import edu.aku.dmu.quasi_experimental.utils.DateUtils;

public class SectionExaminationActivity extends AppCompatActivity {

    ActivitySectionExaminationBinding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_examination);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        bi.setForm(patientDetails);

        //setMinDate
        bi.se405.setMinDate(DateUtils.getMonthsBack("dd/MM/yyyy", -10));
        //setMaxDate
        bi.se406.setMaxDate(DateUtils.getMonthsBack("dd/MM/yyyy", 9));
    }


    private boolean updateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = 0;
        try {
            updcount = db.updatesPDColumn(TableContract.PDTable.COLUMN_SEXM, patientDetails.sEXMtoString());
        } catch (JSONException e) {
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    public void BtnContinue(View view) {
        if (!formValidation()) return;
        if (updateDB()) {
            finish();
            diagnosis = new Diagnosis();
            startActivity(new Intent(this, SectionDiagnosisActivity.class));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    public void BtnEnd(View view) {
        finish();
//        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }

    @Override
    protected void onResume() {
        super.onResume();
        MainApp.lockScreen(this);
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
        setResult(RESULT_CANCELED);
//        finish();
    }
}