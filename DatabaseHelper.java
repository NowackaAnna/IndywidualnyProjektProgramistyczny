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

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Trening2.db";
    public static final String TABLE_NAME = "Trening_table";
    public static final String ID = "ID";
    public static final String AKCENT = "SRODEK_TRENINGOWY";
    public static final String KM = "KILOMETRY";
    public static final String M = "METRY";
    public static final String POWT = "POWTORZENIA";
    public static final String KG = "KILOGRAMY";
    public static final String CZASMIN = "CZAS_MINUTY";
    public static final String TRESC = "TRESC_TRENINGU";
    public static final String DODATKOWE = "DODATKOWE_INFORMACJE";
    public static final String DATE = "DATE";




    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table Trening("+"id integer primary key autoincrement," + "SRODEK_TRENINGOWY text," + "KILOMETRY text," + "METRY text," + "POWTORZENIA text," + "KILOGRAMY text," + "CZAS_MINUTY text," + "TRESC_TRENINGU text," + "DODATKOWE_INFORMACJE text," + "DATE text);" +"");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insertData(String SRODEK_TRENINGOWY, String KILOMETRY, String METRY, String POWTORZENIA, String KILOGRAMY, String CZAS_MINUTY, String TRESC_TRENINGU, String DODATKOWE_INFORMACJE, String DATE) {
        SQLiteDatabase db = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("SRODEK_TRENINGOWY", SRODEK_TRENINGOWY);
            contentValues.put("KILOMETRY", KILOMETRY);
            contentValues.put("METRY", METRY);
            contentValues.put("POWTORZENIA", POWTORZENIA);
            contentValues.put("KILOGRAMY", KILOGRAMY);
            contentValues.put("CZAS_MINUTY", CZAS_MINUTY);
            contentValues.put("TRESC_TRENINGU", TRESC_TRENINGU);
            contentValues.put("DODATKOWE_INFORMACJE", DODATKOWE_INFORMACJE);
            contentValues.put("DATE", DATE);
            db.insertOrThrow("Trening", null, contentValues);
    }

    public Cursor pokazWszystkie(){
        String[] kolumny = {"id","SRODEK_TRENINGOWY","KILOMETRY","METRY","POWTORZENIA","KILOGRAMY","CZAS_MINUTY","TRESC_TRENINGU","DODATKOWE_INFORMACJE","DATE"};
        SQLiteDatabase db = getReadableDatabase();
        Cursor kursor = db.query("Trening",kolumny,null,null,null,null,null);
        return kursor;
    }

    public Rekord pokazWybrane(String DATE){
        Rekord rekord = new Rekord();
        SQLiteDatabase db = getReadableDatabase();
        String[] kolumny = {"id","SRODEK_TRENINGOWY","KILOMETRY","METRY","POWTORZENIA","KILOGRAMY","CZAS_MINUTY","TRESC_TRENINGU","DODATKOWE_INFORMACJE","DATE"};
        String args[] = {DATE+""};
        Cursor kursor = db.query("Trening",kolumny," DATE=?",args,null,null,null, null);
        if(kursor != null){
            while (kursor.moveToNext()){
                rekord.setNr(kursor.getLong(0));
                rekord.setSrodek(kursor.getString(1));
                rekord.setKilometry(kursor.getString(2));
                rekord.setMetry(kursor.getString(3));
                rekord.setPowtorzenia(kursor.getString(4));
                rekord.setKilogramy(kursor.getString(5));
                rekord.setCzas(kursor.getString(6));
                rekord.setTresc(kursor.getString(7));
                rekord.setData(kursor.getString(9));}

        }
        return rekord;
    }

    public List<Rekord> pokazWybrane2(String DATE){
        List<Rekord> wybrane = new LinkedList<Rekord>();
        SQLiteDatabase db = getReadableDatabase();
        String[] kolumny = {"id","SRODEK_TRENINGOWY","KILOMETRY","METRY","POWTORZENIA","KILOGRAMY","CZAS_MINUTY","TRESC_TRENINGU","DODATKOWE_INFORMACJE","DATE"};
        String args[] = {DATE+""};
        Cursor kursor = db.query("Trening",kolumny," DATE=?",args,null,null,null, null);
        if(kursor != null){
            while (kursor.moveToNext()){
                Rekord rekord = new Rekord();
                rekord.setNr(kursor.getLong(0));
                rekord.setSrodek(kursor.getString(1));
                rekord.setKilometry(kursor.getString(2));
                rekord.setMetry(kursor.getString(3));
                rekord.setPowtorzenia(kursor.getString(4));
                rekord.setKilogramy(kursor.getString(5));
                rekord.setCzas(kursor.getString(6));
                rekord.setTresc(kursor.getString(7));
                rekord.setData(kursor.getString(9));
                wybrane.add(rekord);}

        }
        return wybrane;
    }

    public void usunTrening(String DATE){
        SQLiteDatabase db = getWritableDatabase();
        String[] argumenty = {""+DATE};
        db.delete("Trening", "DATE=?",argumenty);
    }

    public List<Rekord> pokazWybranepoAkcencie(String AKCENT){
        List<Rekord> wybrane2 = new LinkedList<Rekord>();
        SQLiteDatabase db = getReadableDatabase();
        String[] kolumny = {"id","SRODEK_TRENINGOWY","KILOMETRY","METRY","POWTORZENIA","KILOGRAMY","CZAS_MINUTY","TRESC_TRENINGU","DODATKOWE_INFORMACJE","DATE"};
        String args[] = {AKCENT+""};
        Cursor kursor = db.query("Trening",kolumny," SRODEK_TRENINGOWY=?",args,null,null,null, null);
        if(kursor != null){
            while (kursor.moveToNext()){
                Rekord rekord = new Rekord();
                rekord.setNr(kursor.getLong(0));
                rekord.setSrodek(kursor.getString(1));
                rekord.setKilometry(kursor.getString(2));
                rekord.setMetry(kursor.getString(3));
                rekord.setPowtorzenia(kursor.getString(4));
                rekord.setKilogramy(kursor.getString(5));
                rekord.setCzas(kursor.getString(6));
                rekord.setTresc(kursor.getString(7));
                rekord.setData(kursor.getString(9));
                wybrane2.add(rekord);}

        }
        return wybrane2;
    }





}
