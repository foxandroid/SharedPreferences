package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    private  static int SPLASH_SCREEN_TIME = 2000;
    boolean firsttime = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        SharedPreferences ref = getApplicationContext().getSharedPreferences("firstTimeCheck",Context.MODE_PRIVATE);
        firsttime = ref.getBoolean("FirstTimeStartFlag",true);
        if (firsttime){

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    Intent i = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(i);
                    finish();

                }
            },SPLASH_SCREEN_TIME);

        }else {

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    Intent i = new Intent(SplashScreen.this,
                            Activity2.class);
                    startActivity(i);
                    finish();

                }
            },SPLASH_SCREEN_TIME);


        }
        }
    }
