package com.quinto.pe3quintojustinramille;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper{
    String col2 = "Company";
    String col3 = "Country";
    String col4 = "Industry";
    String col5 = "CEO";
    String table = "comp";

    public DBHelper(@Nullable Context context) {
        super(context, "company.db", null, 1);
        this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE comp (ID INTEGER PRIMARY KEY AUTOINCREMENT, Company TEXT, Country TEXT, Industry TEXT, CEO Text)";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public long insert(String company, String country, String industry, String ceo){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(col2, company);
        cv.put(col3, country);
        cv.put(col4, industry);
        cv.put(col5, ceo);
        return db.insert(table, null, cv);
    }

    public Cursor getRecord(){
        SQLiteDatabase db = this.getWritableDatabase();
        String selectAll = "SELECT * FROM comp";
        return db.rawQuery(selectAll, null);
    }
}
