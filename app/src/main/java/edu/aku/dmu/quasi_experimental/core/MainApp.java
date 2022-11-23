package edu.aku.dmu.quasi_experimental.core;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.Settings;
import android.util.Log;
import android.view.View;

import com.jakewharton.threetenabp.AndroidThreeTen;

import net.sqlcipher.database.SQLiteDatabase;

import org.json.JSONArray;

import java.io.File;
import java.util.List;

import edu.aku.dmu.quasi_experimental.Room.QuasiRoomDatabase;
import edu.aku.dmu.quasi_experimental.models.Clusters;
import edu.aku.dmu.quasi_experimental.models.Complaints;
import edu.aku.dmu.quasi_experimental.models.Diagnosis;
import edu.aku.dmu.quasi_experimental.models.Form;
import edu.aku.dmu.quasi_experimental.models.PatientDetails;
import edu.aku.dmu.quasi_experimental.models.Prescription;
import edu.aku.dmu.quasi_experimental.models.RandomHH;
import edu.aku.dmu.quasi_experimental.models.Users;
import edu.aku.dmu.quasi_experimental.models.Vaccination;
import edu.aku.dmu.quasi_experimental.ui.LockActivity;

public class MainApp extends Application {

    public static final String PROJECT_NAME = "HF Patient_V2";
    public static final String SYNC_LOGIN = "sync_login";
    public static final String _IP = "https://vcoe1.aku.edu";// .LIVE server
    public static final String _HOST_URL = MainApp._IP + "/hfp/api/";// .TEST server;
    public static final String _SERVER_URL = "syncGCM.php";
    public static final String _SERVER_GET_URL = "getDataGCM.php";
    public static final String _PHOTO_UPLOAD_URL = _HOST_URL + "uploads.php";
    public static final String _APP_FOLDER = "../app/";
    public static final String _UPDATE_URL = MainApp._IP + "/app/";
    public static final String _USER_URL = "resetpasswordgcm.php";
    public static final String _EMPTY_ = "";
    private static final String TAG = "MainApp";
    public static File sdDir;
    public static String[] downloadData;
    public static String DeviceURL = "devices.php";
    public static AppInfo appInfo;
    public static Users user;
    public static Boolean admin = false;
    public static List<JSONArray> uploadData;
    public static String deviceid;
    public static SharedPreferences.Editor editor;
    public static SharedPreferences sharedPref;
    public static String IBAHC = "";
    public static int TRATS = 8;
    public static String selectedDoctorCode;
    public static String selectedDoctorName;

    public static boolean permissionCheck = false;
    public static int entryType = 0;


    public static PatientDetails patientDetails;
    public static Form form;
    public static Complaints complaints;
    public static Diagnosis diagnosis;
    public static Prescription prescription;
    public static Vaccination vaccination;
    public static CountDownTimer timer;
    static ToneGenerator toneGen1;
    public static int selectedLanguage = 0;
    public static boolean langRTL = false;
    public static boolean superuser;
    public static Clusters selectedCluster;
    public static RandomHH selectedHousehold;

    public static void hideSystemUI(View decorView) {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    public static void lockScreen(Context c) {

        if (timer != null) {
            timer.cancel();
        }

        //   Context mContext = c;
        Activity activity = (Activity) c;


        timer = new CountDownTimer(15 * 60 * 1000, 1000) {
            //timer = new CountDownTimer(30 * 1000, 1000) {

            public void onTick(long millisUntilFinished) {
                //Some code
                //bi.timeLeft.setText((millisUntilFinished / 1000) + " secs left");
                if ((millisUntilFinished / 1000) < 14) {
                    toneGen1.startTone(ToneGenerator.TONE_CDMA_PIP, 150);
                }

            }

            public void onFinish() {
                //Logout
                //
                //   finish();
                // lockScreen();
                Intent intent = new Intent();
                intent.setClass(c, LockActivity.class);
                c.startActivity(intent);
                timer.cancel();
                //  startActivity(new Intent(((Activity) c).getLocalClassName(), LockActivity.class));
            }
        };
        timer.start();

    }

    @Override
    public void onCreate() {
        super.onCreate();

                /*
        RootBeer rootBeer = new RootBeer(this);
        if (rootBeer.isRooted()) {
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }*/

        //Initiate DateTime
        AndroidThreeTen.init(this);
        //Initializ App info
        appInfo = new AppInfo(this);
        sharedPref = getSharedPreferences(PROJECT_NAME, MODE_PRIVATE);
        editor = sharedPref.edit();
        deviceid = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);

        initSecure();

    }

    private void initSecure() {
        // Initialize SQLCipher library
        SQLiteDatabase.loadLibs(this);
        //File databaseFile = getDatabasePath(DATABASE_NAME);
       /* databaseFile.mkdirs();
        databaseFile.delete();*/
        //SQLiteDatabase database = SQLiteDatabase.openOrCreateDatabase(databaseFile, DATABASE_PASSWORD, null);
        // Prepare encryption KEY
        ApplicationInfo ai = null;
        try {
            ai = getPackageManager().getApplicationInfo(getPackageName(), PackageManager.GET_META_DATA);
            Bundle bundle = ai.metaData;
            TRATS = bundle.getInt("YEK_TRATS");
            //IBAHC = bundle.getString("YEK_REVRES").substring(TRATS, TRATS + 16);
            IBAHC = bundle.getString("YEK_REVRES");
            Log.d(TAG, "onCreate: YEK_REVRES = " + IBAHC);

            // Room DB
            QuasiRoomDatabase.init(this, IBAHC);

        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}
