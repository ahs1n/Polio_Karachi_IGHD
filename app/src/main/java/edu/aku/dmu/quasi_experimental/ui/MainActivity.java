package edu.aku.dmu.quasi_experimental.ui;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static edu.aku.dmu.quasi_experimental.core.MainApp.sharedPref;
import static edu.aku.dmu.quasi_experimental.utils.AndroidUtilityKt.isNetworkConnected;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.wajahatkarim3.roomexplorer.RoomExplorer;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import edu.aku.dmu.quasi_experimental.R;
import edu.aku.dmu.quasi_experimental.Room.QuasiRoomDatabase;
import edu.aku.dmu.quasi_experimental.core.MainApp;
import edu.aku.dmu.quasi_experimental.database.AndroidManager;
import edu.aku.dmu.quasi_experimental.databinding.ActivityMainBinding;
import edu.aku.dmu.quasi_experimental.models.PatientDetails;
import edu.aku.dmu.quasi_experimental.ui.list_activity.FormsReportCluster;
import edu.aku.dmu.quasi_experimental.ui.list_activity.FormsReportDate;
import edu.aku.dmu.quasi_experimental.ui.sections.SectionScreeningActivity;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    ActivityMainBinding bi;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bi.getRoot());

        // bi = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSupportActionBar(bi.toolbar);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        //getSupportActionBar().setIcon(R.drawable.app_icon);
        bi.adminView.setVisibility(MainApp.admin ? View.VISIBLE : View.GONE);
        bi.toolbar.setSubtitle("Welcome, " + MainApp.user.getFullname() + (MainApp.admin ? " (Admin)" : "") + "!");
        invalidateOptionsMenu();


        try {
            String pwExpiry = String.valueOf(new JSONObject(MainApp.user.getPwdExpiry()).get("date")).substring(0, 10);
            //     Toast.makeText(this, pwExpiry, Toast.LENGTH_LONG).show();
            Log.d(TAG, "onCreate: pwExpiry: " + pwExpiry);

            Calendar cal = Calendar.getInstance();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            cal.setTime(sdf.parse(pwExpiry));// all done

            int daysLeft = (int) MILLISECONDS.toDays(cal.getTimeInMillis() - System.currentTimeMillis());
            //  Toast.makeText(this, daysLeft+" Days left", Toast.LENGTH_LONG).show();
            if (daysLeft < 1) {
                Toast.makeText(this, "Your password has expired. Please contact your supervisor.", Toast.LENGTH_LONG).show();
                finish();
            }
            if (daysLeft < 10) {
                bi.newApp.setText("Your current password is expiring in " + daysLeft + " day(s) on " + pwExpiry + ". Please change your password to avoid account lockout. (Internet Required.)");
                // bi.message.setText("Your password will expire on " + pwExpiry + ". There are only " + daysLeft + " Days left.");
                bi.newApp.setVisibility(View.VISIBLE);
            } else {
                bi.newApp.setVisibility(View.GONE);
            }

        } catch (JSONException | ParseException e) {
            e.printStackTrace();
        }


        String latestVersionName = sharedPref.getString("versionName", "");
        int latestVersionCode = Integer.parseInt(sharedPref.getString("versionCode", "0"));

        if (MainApp.appInfo.getVersionCode() < latestVersionCode) {
            bi.newApp.setVisibility(View.VISIBLE);
            bi.newApp.setText("NOTICE: There is a newer version of this app available on server (" + latestVersionName + latestVersionCode + "). \nPlease download update the app now.");
        } else {
            bi.newApp.setVisibility(View.GONE);

        }
    }

    public void sectionPress(View view) {


        switch (view.getId()) {
            case R.id.startInterview:
                MainApp.entryType = 1;
                break;
/*            case R.id.startDataEntry:
                MainApp.entryType = 2;
                break;*/
/*
            case R.id.updateBlood:
                MainApp.entryType = 3;
                break;

            case R.id.updateStool:
                MainApp.entryType = 4;
                break;*/
            default:
                MainApp.entryType = 0;

        }


        switch (view.getId()) {

            case R.id.startInterview:
                MainApp.patientDetails = new PatientDetails();
                startActivity(new Intent(this, SectionScreeningActivity.class));
                break;

            case R.id.dbManager:
                RoomExplorer.show(this, QuasiRoomDatabase.class, QuasiRoomDatabase.DATABASE_NAME);
                break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = null;
        switch (item.getItemId()) {
            case R.id.action_database:
                intent = new Intent(MainActivity.this, AndroidManager.class);
                startActivity(intent);
                break;

            case R.id.action_data_sync:
                if (isNetworkConnected(this)) {
                    intent = new Intent(MainActivity.this, SyncActivity.class);
                    startActivity(intent);
                } else
                    Toast.makeText(
                            this,
                            "Network connection not available!",
                            Toast.LENGTH_SHORT
                    )
                            .show();
                return true;
            case R.id.changePassword:
                intent = new Intent(MainActivity.this, ChangePasswordActivity.class);
                startActivity(intent);
                break;
            case R.id.formsReportDate:
                intent = new Intent(MainActivity.this, FormsReportDate.class);
                startActivity(intent);
                break;
            case R.id.formsReportCluster:
                intent = new Intent(MainActivity.this, FormsReportCluster.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        MenuItem action_database = menu.findItem(R.id.action_database);

        action_database.setVisible(MainApp.admin);
        return true;

    }

}