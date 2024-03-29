package edu.aku.dmu.polio_karachi_ighd.ui.sections;

import static edu.aku.dmu.polio_karachi_ighd.core.MainApp.form;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.dmu.polio_karachi_ighd.R;
import edu.aku.dmu.polio_karachi_ighd.contracts.TableContracts;
import edu.aku.dmu.polio_karachi_ighd.core.MainApp;
import edu.aku.dmu.polio_karachi_ighd.database.DatabaseHelper;
import edu.aku.dmu.polio_karachi_ighd.databinding.ActivitySectionRiBinding;
import edu.aku.dmu.polio_karachi_ighd.ui.EndingActivity;
import edu.aku.dmu.polio_karachi_ighd.ui.lists.HouseholdScreenActivity;

public class SectionRIActivity extends AppCompatActivity {


    private static final String TAG = "SectionRIActivity";
    ActivitySectionRiBinding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_ri);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        bi.setForm(form);
        setupListener();
    }

    private void setupListener() {

        bi.hh201.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    try {
                        float totalFamily = Integer.parseInt(form.getHh19a()) + Integer.parseInt(form.getHh19b());

                        bi.hh20a.setMaxvalue(totalFamily - 1f);
                    } catch (NumberFormatException e) {
                        bi.hh20a.setMaxvalue(0f);
                        bi.hh20a.setMinvalue(0f);
                    }
                }
            }
        });

      /*  bi.hh14.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String age = editable.toString();

                if (!age.isEmpty()){
                    if (Integer.parseInt(age) < 14 ){
                        Validator.emptyCustomTextBox(SectionRIActivity.this, bi.hh14, "The Age Should not be less than 14 Years");
                    }
                }
            }
        });*/
    }


    private boolean updateDB() {
        if (MainApp.superuser) return true;

        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesFormColumn(TableContracts.FormsTable.COLUMN_SHH, form.sHHtoString());
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
        if (updateDB()) {
            finish();
            if (form.getHh20().equals("1")) {
                startActivity(new Intent(this, HouseholdScreenActivity.class));
            } else {
                startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false).putExtra("checkToEnable", 7));
            }
        } else
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }

    private boolean formValidation() {
        if (!Validator.emptyCheckingContainer(this, bi.GrpName))
            return false;
        int total = Integer.parseInt(bi.hh19a.getText().toString()) + Integer.parseInt(bi.hh19b.getText().toString());
        if (total != Integer.parseInt(bi.hh19t.getText().toString()))
            return Validator.emptyCustomTextBox(this, bi.hh19t, "Error in total count");
        return true;
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
        setResult(RESULT_CANCELED);
    }

    @Override
    protected void onResume() {
        super.onResume();
        MainApp.lockScreen(this);
    }


}