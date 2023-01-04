package com.example.threshersswimmingclub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username_52, password_52;
    RadioGroup radioGrp_52;
    RadioButton UserRadio_52, EmpRadio_52;
    Button btnlogin_52;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Find existing view from XML, and assign an identifier name, for later retrieval.
        //Getting the IDs of EditTexts, and Buttons.
        username_52 = (EditText) findViewById(R.id.edt_user1);
        password_52 = (EditText) findViewById(R.id.edt_pass1);
        radioGrp_52 =(RadioGroup)findViewById(R.id.radioGroup);
        UserRadio_52 =(RadioButton)findViewById(R.id.radio_user);
        EmpRadio_52 = (RadioButton) findViewById(R.id.radio_employee);
        btnlogin_52 = (Button) findViewById(R.id.btn_login1);
        //Functions when Login Button clicked
        btnlogin_52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Getting the EditTexts (username_52 & password_52)
                String user_52 = username_52.getText().toString();
                String pass_52 = password_52.getText().toString();
                //If fields (EditText) user_52 & pass_52 are empty...
                if(user_52.equals("")||pass_52.equals(""))
                    //If fields empty, Popup Toast
                    Toast.makeText(MainActivity.this, "You Must enter all the fields", Toast.LENGTH_SHORT).show();
                //If fields (EditText) user_52 & pass_52 are Not empty...
                else{
                    //If fields (EditText) user_52 & pass_52 are both admin...
                    if(user_52.equals("admin") && pass_52.equals("admin")){
                        //Checking checked radio button (User or Employee)...
                        //If checked radio button is (UserRadio_52)...
                        if(UserRadio_52.isChecked()){
                            //UserHome_18f18052 activity will open using Intent object
                            Intent ActInt52  = new Intent(getApplicationContext(), UserHome_18f18052.class);
                            startActivity(ActInt52);
                            Toast.makeText(MainActivity.this, "Sign in successful", Toast.LENGTH_SHORT).show();
                        //If checked radio button is (EmpRadio_52)...
                        }else if(EmpRadio_52.isChecked()){
                            //EmpHome_18f18052 activity will open using Intent
                            Intent ActInt52  = new Intent(getApplicationContext(), EmpHome_18f18052.class);
                            startActivity(ActInt52);
                            Toast.makeText(MainActivity.this, "Sign in successfull", Toast.LENGTH_SHORT).show();
                        //Checking if no radio button is checked. Toast will Popup.
                        }else {
                            Toast.makeText(MainActivity.this, "Please check User/Employee", Toast.LENGTH_SHORT).show();
                        }
                    //If fields (EditText) user_52 & pass_52 are both wrong...
                    }else{
                        Toast.makeText(MainActivity.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}