package com.ArcherInfotech.tutionapp.SQLiteDB;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBase extends SQLiteOpenHelper {
    public DataBase(@Nullable Context context) {
        super(context, "admission.db",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase MyDB) {
        MyDB.execSQL("CREATE TABLE users (username TEXT PRIMARY KEY, email TEXT, phone TEXT, course_date TEXT, course_level TEXT, password TEXT)");
    }


    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int oldVersion, int newVersion) {
        MyDB.execSQL("drop Table if exists users");
    }
    public Boolean insertAdmissionData(String fullName, String email, String phone, String courseDate, String courseLevel) {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("username", fullName);
        contentValues.put("email", email);
        contentValues.put("phone", phone);
        contentValues.put("course_date", courseDate);
        contentValues.put("course_level", courseLevel);

        long result = MyDB.insert("users", null, contentValues);
        return result != -1;
    }

}
