package com.example.aplikacja;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;

public class DatabaseHelperSpr extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Sprawdziany.db";
    public static final String TABLE_NAME = "Sprawdziany_table";
    public static final String ID = "ID";
    public static final String DYSTANS = "DYSTANS";
    public static final String CZAS = "CZAS";
    public static final String DODATKOWE = "DODATKOWE_INFORMACJE";
    public static final String DATE = "DATE";

    public DatabaseHelperSpr(Context context) {
        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table Sprawdziany("+"id integer primary key autoincrement," + "DYSTANS text," + "CZAS text," + "DODATKOWE_INFORMACJE text," + "DATE text);" +"");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insertDataSpr(String DYSTANS, String CZAS, String DODATKOWE_INFORMACJE, String DATE) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("DYSTANS", DYSTANS);
        contentValues.put("CZAS", CZAS);
        contentValues.put("DODATKOWE_INFORMACJE", DODATKOWE_INFORMACJE);
        contentValues.put("DATE", DATE);
        db.insertOrThrow("Sprawdziany", null, contentValues);
    }

    public Cursor pokazWszystkieSpr(){
        String[] kolumnySpr = {"id","DYSTANS","CZAS","DODATKOWE_INFORMACJE","DATE"};
        SQLiteDatabase db = getReadableDatabase();
        Cursor kursorSpr = db.query("Sprawdziany",kolumnySpr,null,null,null,null,null);
        return kursorSpr;
    }

    public List<Sprawdzian> pokazWybraneSpr(String DATE){
        List<Sprawdzian> wybraneSpr = new LinkedList<Sprawdzian>();
        SQLiteDatabase db = getReadableDatabase();
        String[] kolumnySpr = {"id","DYSTANS","CZAS","DODATKOWE_INFORMACJE","DATE"};
        String args[] = {DATE+""};
        Cursor kursorSpr = db.query("Sprawdziany",kolumnySpr," DATE=?",args,null,null,null, null);
        if(kursorSpr != null){
            while (kursorSpr.moveToNext()){
                Sprawdzian sprawdzian = new Sprawdzian();
                sprawdzian.setNr(kursorSpr.getLong(0));
                sprawdzian.setDystans(kursorSpr.getString(1));
                sprawdzian.setCzas(kursorSpr.getString(2));
                sprawdzian.setDodatkowe_informacje(kursorSpr.getString(3));
                sprawdzian.setData(kursorSpr.getString(4));
                wybraneSpr.add(sprawdzian);}

        }
        return wybraneSpr;
    }

    public void usunSpr(String DATE){
        SQLiteDatabase db = getWritableDatabase();
        String[] argumenty = {""+DATE};
        db.delete("Sprawdziany", "DATE=?",argumenty);
    }


}