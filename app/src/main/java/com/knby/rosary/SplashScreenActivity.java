package com.knby.rosary;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Making a handler to stop the activity after 1.5 seconds

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Starts the main activity
                Intent i = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(i);
                // Closes this activity
                finish();
            }
        }, 1500);
    }

}

