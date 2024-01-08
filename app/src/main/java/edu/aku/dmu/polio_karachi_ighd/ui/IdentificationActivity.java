package edu.aku.dmu.polio_karachi_ighd.ui;

import static edu.aku.dmu.polio_karachi_ighd.core.MainApp._EMPTY_;
import static edu.aku.dmu.polio_karachi_ighd.core.MainApp.form;
import static edu.aku.dmu.polio_karachi_ighd.core.MainApp.selectedCluster;
import static edu.aku.dmu.polio_karachi_ighd.core.MainApp.selectedHousehold;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.util.Objects;

import edu.aku.dmu.polio_karachi_ighd.R;
import edu.aku.dmu.polio_karachi_ighd.core.AppTextWatcher;
import edu.aku.dmu.polio_karachi_ighd.core.MainApp;
import edu.aku.dmu.polio_karachi_ighd.database.DatabaseHelper;
import edu.aku.dmu.polio_karachi_ighd.databinding.ActivityIdentificationBinding;
import edu.aku.dmu.polio_karachi_ighd.models.Form;
import edu.aku.dmu.polio_karachi_ighd.ui.sections.ConsentActivity;


public class IdentificationActivity extends AppCompatActivity {

    private static final String TAG = "IdentificationActivity";
    ActivityIdentificationBinding bi;
    private DatabaseHelper db;
    private int c, c1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_identification);
        db = MainApp.appInfo.dbHelper;
        setupSkips();
        initUI();
        //   populateSpinner();

        bi.btnContinue.setText(R.string.open_hh_form);
        if (MainApp.superuser)
            bi.btnContinue.setText("Review Form");
        MainApp.form = new Form();


        /*bi.hh12.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //  Log.d(TAG, "beforeTextChanged: charSequence-"+charSequence+" i-"+i+ " i1-"+i1 +" i2-"+i2);
                c = charSequence.length();

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                c1 = charSequence.length();
                String txt = charSequence.toString();
                Log.d(TAG, "onTextChanged: c-" + c + " c1-" + c1 + "\t\t\tCHAR: " + charSequence);
                Log.d(TAG, "onTextChanged: i-" + i + " i1-" + i1 + " i2-" + i2 + "\t\t\tCHAR: " + charSequence);
         *//*       if (c == 0 && c1 == 1)
                    bi.hh12.setText(bi.hh12.getText().toString() + "-"); // A-
                if (c == 5 && c1 == 6)
                    bi.hh12.setText(bi.hh12.getText().toString() + "-"); // A-0001-

                if (c == 8 && c1 == 7)
                    bi.hh12.setText(bi.hh12.getText().toString().substring(0, 6)); // A-0001
                if (c == 3 && c1 == 2)
                    bi.hh12.setText(bi.hh12.getText().toString().substring(0, 1)); // A*//*

                if (c1 > 1 && charSequence.charAt(1) != '-') {
                    txt = txt.charAt(0) + "-" + txt.substring(1);
                    bi.hh12.setText(txt);
                }

                if (c1 > 6 && charSequence.charAt(6) != '-') {
                    txt = txt.substring(0, 6) + "-" + txt.substring(6);
                    bi.hh12.setText(txt);
                }


                bi.hh12.setSelection(bi.hh12.getText().length());
            }

            @Override
            public void afterTextChanged(Editable editable) {


            }
        });


        bi.newhhid.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                c = charSequence.length();
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                c1 = charSequence.length();
                String txt = charSequence.toString();
                Log.d(TAG, "onTextChanged: c-" + c + " c1-" + c1 + "\t\t\tCHAR: " + charSequence);
                Log.d(TAG, "onTextChanged: i-" + i + " i1-" + i1 + " i2-" + i2 + "\t\t\tCHAR: " + charSequence);

                if (c1 > 1 && charSequence.charAt(1) != '-') {
                    txt = txt.charAt(0) + "-" + txt.substring(1);
                    bi.newhhid.setText(txt);
                }
                if (c1 > 6 && charSequence.charAt(6) != '-') {
                    txt = txt.substring(0, 6) + "-" + txt.substring(6);
                    bi.newhhid.setText(txt);
                }
                bi.newhhid.setSelection(bi.newhhid.getText().length());
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });*/
    }

    private void initUI() {
        // Cluster Search
        bi.hh05.addTextChangedListener(new AppTextWatcher(bi.hh05.getId(), iAppTextWatcher));

        // Household Search
        bi.hh12.addTextChangedListener(new AppTextWatcher(bi.hh12.getId(), iAppTextWatcher));
    }


    AppTextWatcher.IAppTextWatcher iAppTextWatcher = new AppTextWatcher.IAppTextWatcher() {
        @Override
        public void afterTextChanged(int viewId, String text) {
            if (viewId == bi.hh05.getId()) {
                // Cluster search
                if (Objects.requireNonNull(bi.hh05.getText()).toString().length() < 9) {
                    bi.hh06.setText(_EMPTY_);
                    bi.hh07.setText(_EMPTY_);
                    bi.hh08.setText(_EMPTY_);
                    bi.hh09.setText(_EMPTY_);
                    bi.hh12.setText(_EMPTY_);
                    bi.checkHh06.setChecked(false);
                    bi.checkHh07.setChecked(false);
                    bi.checkHh08.setChecked(false);
                    bi.checkHh09.setChecked(false);
                    bi.fldGrpCVhh12.setVisibility(View.GONE);
                    bi.fldGrpIdentifier.setVisibility(View.GONE);
                }
            } else if (viewId == bi.hh12.getId()) {
                // Household search
                if (Objects.requireNonNull(bi.hh12.getText()).toString().length() < 3) {
                    bi.hhHeadName.setVisibility(View.GONE);
                    bi.hhHead.setText(_EMPTY_);
                    bi.newhh.setVisibility(View.GONE);
                    bi.newhh.clearCheck();
                    bi.newhha.setChecked(false);
                    bi.newhhb.setChecked(false);
                    bi.checkHhhead.setChecked(false);
                    bi.newhhid.setText(_EMPTY_);
                    bi.newhhhead.setText(_EMPTY_);
                    bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
                    bi.btnContinue.setEnabled(false);
                }
            }
        }
    };

    private void setupSkips() {

        bi.newhh.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.newhhdetails));
    }

    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    public void checkHousehold(View view) {
        if (!formValidation()) return;
    }

    public void btnContinue(View view) {

        if (!formValidation()) return;
        try {
            hhExists();
        } catch (JSONException e) {
            Log.d(TAG, getString(R.string.hh_exists_form) + e.getMessage());
            Toast.makeText(this, getString(R.string.hh_exists_form) + e.getMessage(), Toast.LENGTH_SHORT).show();
            return;
        }
        if (MainApp.form.getSynced().equals("1") && !MainApp.superuser) { // Do not allow synced form to be edited
            Toast.makeText(this, "This form has been locked.", Toast.LENGTH_SHORT).show();
        } else {
            finish();

            MainApp.newHH = (
                    bi.newhha.isChecked() ? "1"
                            : "2");
            MainApp.newHHID = bi.newhhid.getText().toString();
            MainApp.newHHHead = bi.newhhhead.getText().toString();

            form.setNewhhid(bi.newhhid.getText().toString());
            form.setNewhhhead(bi.newhhhead.getText().toString());
            startActivity(new Intent(this, ConsentActivity.class));
        }

    }


    public void btnEnd(View view) {
        finish();
        // startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean hhExists() throws JSONException {


        MainApp.form = new Form();

        MainApp.form = db.getFormByhhid();

        return MainApp.form != null;


    }

    public void checkEBNumber(View view) {
        if (!formValidation()) return;

        bi.hh06.setText(null);      //  Province
        bi.hh07.setText(null);      //  District
        bi.hh08.setText(null);      //  Tehsil
        bi.hh09.setText(null);      //  City/Village
        bi.newhhhead.setText(null);
        bi.hhHead.setText(null);
//        bi.hh16a.setText(null);

        bi.checkHh06.setChecked(false);
        bi.checkHh07.setChecked(false);
        bi.checkHh08.setChecked(false);
        bi.checkHh09.setChecked(false);
        bi.checkHhhead.setChecked(false);

        bi.fldGrpIdentifier.setVisibility(View.GONE);
        bi.headhh.setVisibility(View.GONE);

        bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
        bi.btnContinue.setEnabled(false);

        selectedHousehold = null;

        selectedCluster = db.getClusterByEBNum(bi.hh05.getText().toString());

        if (selectedCluster != null) {
            String[] geoarea = selectedCluster.getGeoarea().split("\\|");
            bi.hh06.setText(geoarea[0]);    //  District
            bi.hh07.setText(geoarea[1]);    //  Tehsil
            bi.hh08.setText(geoarea[2]);    //  uc
            bi.hh09.setText(geoarea[3]);    //  CHW
            bi.fldGrpIdentifier.setVisibility(View.VISIBLE);
        } else {
            Toast.makeText(this, "Enumeration Block not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void checkHH(View view) {
        if (!formValidation()) return;

//        bi.hh16a.setText(null);
        bi.newhhhead.setText(null);
        bi.hhHead.setText(null);
        bi.hhHeadName.setVisibility(View.GONE);
        bi.newhh.setVisibility(View.GONE);
        bi.newhh.clearCheck();
        bi.newhha.setChecked(false);
        bi.newhhb.setChecked(false);
        bi.checkHhhead.setChecked(false);

        bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
        bi.btnContinue.setEnabled(false);

        selectedHousehold = db.getRandomByhhid(bi.hh12.getText().toString());
        if (selectedHousehold != null) {
//            bi.hh16a.setText(selectedHousehold.getHhhead());    // Name of Head
            bi.newhh.setVisibility(View.VISIBLE);
            bi.hhHeadName.setVisibility(View.VISIBLE);
            bi.hhHead.setText(selectedHousehold.getHhhead());
            bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.colorAccent));
            bi.btnContinue.setEnabled(true);
        } else {
            Toast.makeText(this, "Household not found", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        MainApp.lockScreen(this);
    }


}
