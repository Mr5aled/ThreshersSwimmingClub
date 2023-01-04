package com.example.threshersswimmingclub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class CalcPrice_18f18052 extends AppCompatActivity {
    //Declaring variables
    EditText Age_52, Lesson_52;
    RadioGroup radioGrp_52;
    RadioButton YesRadio_52, NoRadio_52;
    Button btnCalculate_52, btnClear_52;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_price18f18052);
        //Find existing view from XML, and assign an identifier name, for later retrieval.
        //Getting the IDs of EditTexts, RadioButtons and Buttons.
        Age_52 = (EditText) findViewById(R.id.edtAge1_52);
        Lesson_52 = (EditText) findViewById(R.id.edtLesson_52);
        radioGrp_52 =(RadioGroup)findViewById(R.id.radioGroup);
        YesRadio_52 =(RadioButton)findViewById(R.id.yesRadio52);
        NoRadio_52 = (RadioButton) findViewById(R.id.noRadio52);
        btnCalculate_52 = (Button) findViewById(R.id.btnCalculate_52);
        btnClear_52 = (Button) findViewById(R.id.btnClear_52);
        //Functions when Calculate Button clicked
        btnCalculate_52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Getting the EditTexts (Age_52 & Lesson_52)
                String Age52 = Age_52.getText().toString();
                String Lesson52 = Lesson_52.getText().toString();
                //Converting the values to int
                int AAge52=Integer.parseInt(Age52);
                int BLesson52=Integer.parseInt(Lesson52);
                int Cost52 = 0; //Giving initial value
                Double Discount52 = null, Result52, Total52;
                //Checking if the specified age if between 3 and 12 to execute condetions.
                //The condition simply changes cost amount and applied at the end.
                if(AAge52 >= 3 && AAge52 <= 12) {
                    //checking number of leasons specified and applying cost
                    if (BLesson52 == 1) {
                        Cost52 = 10;}
                    else if (BLesson52 == 2) {
                        Cost52 = 15;}
                    else if (BLesson52 == 3) {
                        Cost52 = 20;}}
                //Checking if the specified age if between 13 and 17 to execute condetions.
                if(AAge52 >= 13 && AAge52 <= 17) {
                    if (BLesson52 == 1) {
                        Cost52 = 15;}
                    else if (BLesson52 == 2) {
                        Cost52 = 25;}
                    else if (BLesson52 == 3) {
                        Cost52 = 35;} }
                //Checking checked radio button (Yes or No), and apply discount
                if(YesRadio_52.isChecked()){
                    Discount52 = 0.20;
                }else if(NoRadio_52.isChecked()){
                    Discount52 = 0.05;}
                //Calculating the monthly cost
                Result52 = Cost52 * Discount52;
                Total52 = Cost52 - Result52;
                Toast.makeText(CalcPrice_18f18052.this, "Monthly Cost = OMR "+ Total52, Toast.LENGTH_SHORT).show();}
        });
        //Clearing all textfiels as well as radio button
        btnClear_52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Age_52.setText("");
                Lesson_52.setText("");
                YesRadio_52.setChecked(false);
                NoRadio_52.setChecked(false);
            }
        });
    }
}