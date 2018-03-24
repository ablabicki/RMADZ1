package com.ferit.ablavicki.rmadz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread myThread = new Thread(){
            public void run(){
                try {
                    sleep(1000);
                    Intent startMainScreen = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(startMainScreen);
                    finish();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        myThread.start();
    }
}
