package com.example.threshersswimmingclub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen_18f18052 extends AppCompatActivity {
    Handler Handler_18f18052;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen18f18052);
        //Hiding the action bar of the splash screen activity.
        getSupportActionBar().hide();
        //Declaring the Handler as a member variable
        Handler_18f18052 = new Handler();
        Handler_18f18052.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Using Intent for Starting another Activity (MainActivity)
                Intent IntAct_52=new Intent(SplashScreen_18f18052.this,MainActivity.class);
                startActivity(IntAct_52);
                finish();}
        //Setting the duration of the splash screen to 2.9 Sec.
        },2900);
    }
}