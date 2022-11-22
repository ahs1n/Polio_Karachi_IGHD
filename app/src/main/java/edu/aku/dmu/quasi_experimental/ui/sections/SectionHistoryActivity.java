package edu.aku.dmu.quasi_experimental.ui.sections;

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
import edu.aku.dmu.quasi_experimental.databinding.ActivitySectionHistoryBinding;

public class SectionHistoryActivity extends AppCompatActivity {

    ActivitySectionHistoryBinding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_history);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        bi.setForm(patientDetails);
    }


    private boolean updateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = 0;
        try {
            updcount = db.updatesPDColumn(TableContract.PDTable.COLUMN_SHIS, patientDetails.sHIStoString());
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
            startActivity(new Intent(this, SectionExaminationActivity.class));
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