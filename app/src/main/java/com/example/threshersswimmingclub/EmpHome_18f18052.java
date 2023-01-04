package com.example.threshersswimmingclub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EmpHome_18f18052 extends AppCompatActivity {
    Button RegStudent52, CalcPrice52;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emp_home18f18052);
        //Getting the IDs of exciting Buttons from the XML.
        RegStudent52 = (Button) findViewById(R.id.btn_RegStd);
        CalcPrice52 = (Button) findViewById(R.id.btn_Calc);
        //Functions when Register Student Button clicked
        RegStudent52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CalcPrice_18f18052 activity will open using Intent object
                Intent IntAct_52 = new Intent(getApplicationContext(),RegStudent_18f18052.class);
                startActivity(IntAct_52);}
        });
        //Functions when Calculate Price Button clicked
        CalcPrice52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CalcPrice_18f18052 activity will open using Intent object
                Intent IntAct_52 = new Intent(getApplicationContext(),CalcPrice_18f18052.class);
                startActivity(IntAct_52);}
        });
    }
}