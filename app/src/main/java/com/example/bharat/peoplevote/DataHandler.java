package com.example.bharat.peoplevote;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by bharat on 18/8/17.
 */

public class DataHandler {

    private static final String DATABASE_NAME ="Infoappdata.sqlite";
    public static final int DATABASE_VERSION=1;

    private static final String TABLE_NAME="registration_table";
    private static final String COL_NAME ="NAME";
    private static final String COL_EMAIL = "EMAIL";
    private static final String COL_MOBILE = "MOBILE";
    private static final String COL_PASSWORD="PASSWORD";
    private static final String COL_CONFIRMPASS="PASSWORD";

    private static final String register_table = "CREATE TABLE " + TABLE_NAME + "("
            + COL_NAME + " TEXT NOT NULL, "
            + COL_EMAIL + "TEXT NOT NULL, "
            + COL_MOBILE + "TEXT NOT NULL, "
            + COL_PASSWORD + "TEXT NOT NULL, "
            + COL_CONFIRMPASS + "TEXT NOT NULL "
            + ");";




    private static class DatabaseHelper extends SQLiteOpenHelper{

        public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            Log.e("Database Operation ", "Before Table is created");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }
    }
}
