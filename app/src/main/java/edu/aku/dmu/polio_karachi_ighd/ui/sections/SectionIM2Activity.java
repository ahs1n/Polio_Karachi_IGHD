package edu.aku.dmu.polio_karachi_ighd.ui.sections;

import static edu.aku.dmu.polio_karachi_ighd.core.MainApp.child;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.edittextpicker.aliazaz.EditTextPicker;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.util.Arrays;
import java.util.Calendar;

import edu.aku.dmu.polio_karachi_ighd.R;
import edu.aku.dmu.polio_karachi_ighd.contracts.TableContracts;
import edu.aku.dmu.polio_karachi_ighd.core.MainApp;
import edu.aku.dmu.polio_karachi_ighd.database.DatabaseHelper;
import edu.aku.dmu.polio_karachi_ighd.databinding.ActivitySectionIm2Binding;
import edu.aku.dmu.polio_karachi_ighd.ui.ChildEndingActivity;

public class SectionIM2Activity extends AppCompatActivity {


    private static final String TAG = "SectionIM2Activity";
    ActivitySectionIm2Binding bi;
    String[] deff = {"44", "66", "88", "97"};
    private DatabaseHelper db;
    private String requestCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_im2);

        Intent intent = getIntent();
        requestCode = intent.getStringExtra("requestCode");

        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        bi.setForm(child);
        if (MainApp.superuser) bi.btnContinue.setText("Review Next");

        bi.im08text.setText(String.format(getResources().getString(R.string.im08), child.getEc14()));
        bi.im09text.setText(String.format(getResources().getString(R.string.im09), child.getEc14()));
        bi.im10text.setText(String.format(getResources().getString(R.string.im10), child.getEc14()));
        bi.im10atext.setText(String.format(getResources().getString(R.string.im10a), child.getEc14()));
        bi.im14text.setText(String.format(getResources().getString(R.string.im14), child.getEc14()));
        bi.im16text.setText(String.format(getResources().getString(R.string.im16), child.getEc14()));
        bi.im18text.setText(String.format(getResources().getString(R.string.im18), child.getEc14()));
        bi.im20text.setText(String.format(getResources().getString(R.string.im20), child.getEc14()));
        bi.im21text.setText(String.format(getResources().getString(R.string.im21), child.getEc14()));
        bi.im22atext.setText(String.format(getResources().getString(R.string.im22a), child.getEc14()));
        bi.im23text.setText(String.format(getResources().getString(R.string.im23), child.getEc14()));
        bi.im24text.setText(String.format(getResources().getString(R.string.im24), child.getEc14()));
        bi.im24atext.setText(String.format(getResources().getString(R.string.im24a), child.getEc14()));
        bi.im24btext.setText(String.format(getResources().getString(R.string.im24b), child.getEc14()));
        bi.im24ctext.setText(String.format(getResources().getString(R.string.im24c), child.getEc14()));
        bi.b110text.setText(String.format(getResources().getString(R.string.b110), child.getEc14()));
    }


    private void setDefault(EditTextPicker day, EditTextPicker mon, EditTextPicker year) {
        day.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (day.getText().toString().isEmpty()) return;
                mon.setEnabled(true);
                year.setEnabled(true);
                if (Arrays.asList(deff).contains(day.getText().toString())) {
                    day.setRangedefaultvalue(Float.parseFloat(day.getText().toString()));
                    mon.setEnabled(false);
                    year.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        year.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (year.getText().toString().isEmpty()) return;
                mon.setMaxvalue(Integer.parseInt(year.getText().toString()) == Calendar.getInstance().get(Calendar.YEAR) ?
                        Calendar.getInstance().get(Calendar.MONTH) + 1 : 12f);
                day.setMaxvalue(Integer.parseInt(year.getText().toString()) == Calendar.getInstance().get(Calendar.YEAR)
                        && Integer.parseInt(mon.getText().toString()) == Calendar.getInstance().get(Calendar.MONTH) + 1 ?
                        Calendar.getInstance().get(Calendar.DAY_OF_MONTH) : 31f);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });


    }


    private boolean updateDB() {
        if (MainApp.superuser) return true;

        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesChildColumn(TableContracts.ChildTable.COLUMN_SIM, child.sIMtoString());
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
            Intent forwardIntent = new Intent(this, ChildEndingActivity.class);
            forwardIntent.putExtra("complete", true);
            forwardIntent.putExtra("requestCode", requestCode);
            //forwardIntent.putExtra("checkToEnable", 7);
            forwardIntent.setFlags(Intent.FLAG_ACTIVITY_FORWARD_RESULT);
            setResult(RESULT_OK, forwardIntent);

            startActivity(forwardIntent);
            finish();
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    public void btnEnd(View view) {
        setResult(RESULT_CANCELED);
        finish();
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        MainApp.lockScreen(this);
    }

}