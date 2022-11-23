package edu.aku.dmu.quasi_experimental.ui;

import static edu.aku.dmu.quasi_experimental.CONSTANTS.SECTION_MAIN_CHECK_FOR_END;
import static edu.aku.dmu.quasi_experimental.core.MainApp.patientDetails;
import static edu.aku.dmu.quasi_experimental.utils.extension.ActivityExtKt.gotoActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.dmu.quasi_experimental.R;
import edu.aku.dmu.quasi_experimental.contracts.TableContracts;
import edu.aku.dmu.quasi_experimental.core.MainApp;
import edu.aku.dmu.quasi_experimental.database.DatabaseHelper;
import edu.aku.dmu.quasi_experimental.databinding.ActivityEndingBinding;


public class EndingActivity extends AppCompatActivity {

    ActivityEndingBinding bi;
    int sectionMainCheck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_ending);
        bi.setForm(MainApp.form);
        setSupportActionBar(bi.toolbar);

        boolean check = getIntent().getBooleanExtra("complete", false);
        sectionMainCheck = getIntent().getIntExtra(SECTION_MAIN_CHECK_FOR_END, 0);

        if (check) {
            bi.istatusa.setEnabled(true);
            bi.istatusb.setEnabled(false);
            bi.istatusc.setEnabled(false);
        } else {
            bi.istatusa.setEnabled(false);
            bi.istatusb.setEnabled(true);
            bi.istatusc.setEnabled(true);
            bi.btnEnd.setBackgroundColor(getResources().getColor(R.color.redLight));
        }

    }

    private void saveDraft() {
        patientDetails.setiStatus(bi.istatusa.isChecked() ? "1"
                : bi.istatusb.isChecked() ? "2"
                : bi.istatusc.isChecked() ? "3"
                : "-1");
        patientDetails.setEndTime(new SimpleDateFormat("dd-MM-yy HH:mm", Locale.ENGLISH).format(new Date().getTime()));
    }


    public void BtnEnd(View view) {
        if (!formValidation()) return;
        saveDraft();
        if (UpdateDB()) {
            finish();
            gotoActivity(this, EndingActivity.class);
        } else {
            Toast.makeText(this, "Error in updating db!!", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesPDColumn(TableContracts.PDTable.COLUMN_ISTATUS, patientDetails.getiStatus());
        if (updcount > 0) {
            //int count = db.updateEnding();
            return updcount > 0;
        } else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.fldGrpEnd);
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "Back Press Not Allowed", Toast.LENGTH_LONG).show();
    }

}
