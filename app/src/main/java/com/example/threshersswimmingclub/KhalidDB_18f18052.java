package com.example.threshersswimmingclub;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class KhalidDB_18f18052 extends SQLiteOpenHelper {
    //Constants for dbRegStud52 database // database information...
    //Name of the database (RegStud52)
    public static final String DBName52="RegStud52.db";
    //Name of the table (StudDetails52)
    public static final String TableNAME52="StudDetails52";
    //Definition of column names of StudDetails52 table
    public static final String CID_52="ID_52";
    public static final String CName_52="NAME_52";
    public static final String CAge_52="AGE_52";
    public static final String CLevel_52="LEVEL_52";
    //Constructor //Object to create and manage database
    public KhalidDB_18f18052(Context context52) {
        super(context52,DBName52,null,1);
    }
    //Called when DB is created for the first time...
    @Override
    public void onCreate(SQLiteDatabase DB_18f18052) {
        DB_18f18052.execSQL("create table " +TableNAME52+ "(ID_52 INTEGER PRIMARY KEY AUTOINCREMENT, NAME_52 TEXT,AGE_52 INTEGER,LEVEL_52 TEXT)");
    }
    //When changes are made, for upgrading the database, this method is called.
    @Override
    public void onUpgrade(SQLiteDatabase DB_18f18052, int versionN52, int versionO52) {
        DB_18f18052.execSQL("DROP TABLE IF EXISTS " + TableNAME52);
        onCreate(DB_18f18052);
    }
    //insertData52 method is responsible for inserting data into StudDetails52 table
    public boolean insertData52(String Name_18f18052, String Age_18f18052, String Level_18f18052){
        //creating a variable to write our database.
        SQLiteDatabase DB_18f18052 = this.getWritableDatabase();
        //using content value to insert data into table.
        ContentValues contentV2_52= new ContentValues();
        contentV2_52.put(CName_52,Name_18f18052);
        contentV2_52.put(CAge_52,Age_18f18052);
        contentV2_52.put(CLevel_52,Level_18f18052);
        long Res1_52 = DB_18f18052.insert(TableNAME52,null,contentV2_52);
        if(Res1_52==-1)
            return false;
        else
            return true;
    }
    //updateData52 method is responsible for updating StudDetails52 table data.
    public boolean updateData52(String ID_18f18052, String Name_18f18052, String Age_18f18052, String Level_18f18052){
        //creating a variable to write our database.
        SQLiteDatabase DB_18f18052 = this.getWritableDatabase();
        //using content value to insert updated data into table.
        ContentValues contentV3_52= new ContentValues();
        contentV3_52.put(CID_52, ID_18f18052);
        contentV3_52.put(CName_52,Name_18f18052);
        contentV3_52.put(CAge_52,Age_18f18052);
        contentV3_52.put(CLevel_52,Level_18f18052);
        DB_18f18052.update(TableNAME52,contentV3_52,"ID_52=?",new String[]{ID_18f18052});
        return true;
    }
    //deleteData52 method is responsible for deleting unwanted StudDetails52 table data.
    public Integer deleteData52(String ID_18f18052){
        //creating a variable to write our database.
        SQLiteDatabase DB_18f18052 = this.getWritableDatabase();
        return DB_18f18052.delete(TableNAME52,"ID_52=?",new String[]{ID_18f18052});
    }
    //viewallData52 method is responsible for viewing StudDetails52 table data.
    public Cursor viewallData52(){
        //creating a variable to write our database.
        SQLiteDatabase DB_18f18052 = this.getWritableDatabase();
        Cursor cursor52=DB_18f18052.rawQuery("select * from "+TableNAME52, null);
        return cursor52;
    }
}
