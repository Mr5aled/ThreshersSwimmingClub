package com.example.threshersswimmingclub;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegStudent_18f18052 extends AppCompatActivity {
    //Declaring Variables for EditText, Button, and KhalidDB_18f18052 (Database).
    EditText ID_18f18052, Name_18f18052, Age_18f18052, Level_18f18052;
    Button Add_52, Delete_52, Update_52, View_52, Clear_52;
    KhalidDB_18f18052 DBKhalid_52;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_student18f18052);
        //Declaring our KhalidDB_18f18052 (Database) class.
        DBKhalid_52 = new KhalidDB_18f18052(this);
        //Find existing view from XML, and assign an identifier name, for later retrieval.
        //Getting the IDs of EditTexts and Buttons.
        ID_18f18052=(EditText) findViewById(R.id.edtID_52);
        Name_18f18052=(EditText) findViewById(R.id.edtName_52);
        Age_18f18052=(EditText) findViewById(R.id.edtAge_52);
        Level_18f18052=(EditText) findViewById(R.id.edtSLevel_52);
        Add_52=(Button) findViewById(R.id.btnAdd_52);
        Update_52=(Button) findViewById(R.id.btnUpdate_52);
        Delete_52=(Button) findViewById(R.id.btnDelete_52);
        View_52=(Button) findViewById(R.id.btnView_52);
        Clear_52=(Button) findViewById(R.id.btnClear);

        //Calling methods
        addData_18f18052();
        updateData_18f18052();
        deleteData_18f18052();
        viewData_18f18052();
        clearData_18f18052();
    }
    //addData_18f18052 method is responsible for Adding data to StudDetails52 table.
    public void addData_18f18052(){
        //Functions when Add Button clicked
        Add_52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Calling insert52 method and passing all data.
                boolean insert52=DBKhalid_52.insertData52(Name_18f18052.getText().toString(),Age_18f18052.getText().toString(),Level_18f18052.getText().toString());
                if (insert52==true) //If data successfully inserted toast will popup saying so.
                    Toast.makeText(RegStudent_18f18052.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                else //If failed to insert, toast will popup saying so.
                    Toast.makeText(RegStudent_18f18052.this, "Failed to Insert", Toast.LENGTH_SHORT).show();
            }
        });
    }
    //updateData_18f18052 method is responsible for updating data of StudDetails52 table.
    public void updateData_18f18052(){
        //Functions when Update Button clicked
        Update_52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Calling update52 method and passing all edited data.
                boolean update52=DBKhalid_52.updateData52(ID_18f18052.getText().toString(),Name_18f18052.getText().toString(),Age_18f18052.getText().toString(),Level_18f18052.getText().toString());
                if (update52==true) //If data successfully updated toast will popup saying so.
                    Toast.makeText(RegStudent_18f18052.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                else //If failed to update, toast will popup saying so.
                    Toast.makeText(RegStudent_18f18052.this, "Failed to update", Toast.LENGTH_SHORT).show();
            }
        });
    }
    //deleteData_18f18052 method is responsible for deleting data of StudDetails52 table.
    public void deleteData_18f18052(){
        //Functions when Delete Button clicked
        Delete_52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer delete52=DBKhalid_52.deleteData52(ID_18f18052.getText().toString());
                if (delete52>0) //If data successfully deleted toast will popup saying so.
                    Toast.makeText(RegStudent_18f18052.this, "Deleted successfully", Toast.LENGTH_SHORT).show();
                else //If failed to delete, toast will popup saying so.
                    Toast.makeText(RegStudent_18f18052.this, "Failed to delete", Toast.LENGTH_SHORT).show();
            }
        });
    }
    //viewData_18f18052 method is responsible for viewing StudDetails52 table data.
    public void viewData_18f18052(){
        //Functions when View Button clicked
        View_52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Creating r52 Cursor to read data from database.
                Cursor r52=DBKhalid_52.viewallData52();
                if(r52.getCount()==0)
                {showMessage52("Error", "Nothing found");
                    return;}
                StringBuffer SB52=new StringBuffer();
                while(r52.moveToNext())
                { //Adding data from r52 Cursor.
                    SB52.append("ID_52:"+r52.getString(0)+"\n");
                    SB52.append("NAME_52:"+r52.getString(1)+"\n");
                    SB52.append("AGE_52:"+r52.getString(2)+"\n");
                    SB52.append("LEVEL_52:"+r52.getString(3)+"\n");
                }
                showMessage52("Student Details",SB52.toString());
            }
        });
    }
    //clearData_18f18052 method is responsible for clearing all text field.
    public void clearData_18f18052(){
        //Functions when Clear Button clicked
        Clear_52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Clearing all text field.
                ID_18f18052.setText("");
                Name_18f18052.setText("");
                Age_18f18052.setText("");
                Level_18f18052.setText("");
            }
        });
    }
    //showMessage52 method is responsible for Displaying dialog message.
    public void showMessage52(String subject52,String message52)
    //Creating the object of AlertDialog Builder class.
    {   AlertDialog.Builder ad52=new AlertDialog.Builder(this);
        ad52.setCancelable(true);
        //set title for dialog
        ad52.setTitle(subject52);
        //set message
        ad52.setMessage(message52);
        ad52.show();
    }
    //onCreateOptionsMenu method inflate XML defined menu resource into the Menu
    public boolean onCreateOptionsMenu(Menu MyMenu52)
    {   getMenuInflater().inflate(R.menu.style52,MyMenu52);
        return super.onCreateOptionsMenu(MyMenu52);
    }
    //onOptionsItemSelected method passes the selected MenuItem
    public boolean onOptionsItemSelected(MenuItem menuItem52)
    {   // Handle item selection
        int id52=menuItem52.getItemId();
        if(id52==R.id.action_settings)
        {   return true; }
        return super.onOptionsItemSelected(menuItem52);
    }
}