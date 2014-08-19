package com.example.citygates;


import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;


public class Splash extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        int secondsDelayed = 1;
        new Handler().postDelayed(new Runnable() {
                public void run() {
                        startActivity(new Intent(Splash.this, Home.class));
                        finish();
                }
        }, secondsDelayed * 1000);
    }
}