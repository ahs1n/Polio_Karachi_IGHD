package edu.aku.dmu.polio_karachi_ighd.ui.sections;

import static edu.aku.dmu.polio_karachi_ighd.core.MainApp.form;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.dmu.polio_karachi_ighd.R;
import edu.aku.dmu.polio_karachi_ighd.contracts.TableContracts;
import edu.aku.dmu.polio_karachi_ighd.core.MainApp;
import edu.aku.dmu.polio_karachi_ighd.database.DatabaseHelper;
import edu.aku.dmu.polio_karachi_ighd.databinding.ActivitySectionSs2Binding;

public class SectionSS_2Activity extends AppCompatActivity {


    private static final String TAG = "SectionSS_2Activity";
    ActivitySectionSs2Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_ss_2);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        bi.setForm(form);
    }

    private boolean updateDB() {
        if (MainApp.superuser) return true;

        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesFormColumn(TableContracts.FormsTable.COLUMN_SSS, form.sSStoString());
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, R.string.upd_db + e.getMessage());
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount > 0) return true;
        else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    public void btnContinue(View view) {
        if (!formValidation()) return;
        // if (!insertNewRecord()) return;
        // saveDraft();
        if (updateDB()) {
            Intent returnIntent = new Intent();
            returnIntent.putExtra("complete", true);
            returnIntent.putExtra("requestCode", "1");
            setResult(RESULT_OK, returnIntent);
            finish();
        } else {
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        }
    }


    public void btnEnd(View view) {
        Intent returnIntent = new Intent();
        returnIntent.putExtra("complete", false);
        returnIntent.putExtra("requestCode", "1");
        setResult(RESULT_CANCELED, returnIntent);
        finish();
        //  startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }

    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
        //  setResult(RESULT_CANCELED); finish();
    }

    @Override
    protected void onResume() {
        super.onResume();
        MainApp.lockScreen(this);
    }
}