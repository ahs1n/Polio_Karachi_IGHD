package edu.aku.dmu.quasi_experimental.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import edu.aku.dmu.quasi_experimental.R;

public class SplashActivity extends AppCompatActivity {

    private final int SPLASH_TIME = 1 * 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread th = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(SPLASH_TIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                    finish();
                }
            }
        };
        th.start();

    }
}