package com.example.aplikacja;

import android.app.Activity;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.renderscript.Sampler;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.QuoteSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.graphics.Color;
import android.text.Spannable;

import org.w3c.dom.Text;

import java.util.Random;

public class Podsumowaniewszystko extends AppCompatActivity {
    Button pokazwszytsko;
    TextView textpokazwszytsko;
    TextView pasekkolor;
    TextView pasekkolor2;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podsumowaniewszystko);

        myDb = new DatabaseHelper(this);
        pokazwszytsko = (Button) findViewById(R.id.pokazwszystko);
        pokazwszytsko.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Pokazwszystko();
            }
        });

        TextView textpokazwszystko = (TextView) findViewById(R.id.textpokazwszystko);

        TextView pasekkolor = (TextView) findViewById(R.id.pasekkolor);
        TextView pasekkolor2 = (TextView) findViewById(R.id.pasekkolor2);
    }

    public void Pokazwszystko(){
        TextView pasekkolor = (TextView) findViewById(R.id.pasekkolor);
        pasekkolor.setBackgroundResource(R.drawable.pasek);
        TextView pasekkolor2 = (TextView) findViewById(R.id.pasekkolor2);
        pasekkolor2.setBackgroundResource(R.drawable.pasek);
        TextView textpokazwszystko = (TextView) findViewById(R.id.textpokazwszystko);
        textpokazwszystko.setBackgroundResource(R.drawable.wszystkopokaz);
        textpokazwszystko.setText("");
        textpokazwszystko.setMovementMethod(new ScrollingMovementMethod());
        Cursor k = myDb.pokazWszystkie();
        while (k.moveToNext()) {
            int nr = k.getInt(0);
            String srodek = k.getString(1);
            String kilometry = k.getString(2);
            String metry = k.getString(3);
            String powtorzenia = k.getString(4);
            String kilogramy = k.getString(5);
            String czas = k.getString(6);
            String tresc = k.getString(7);
            String data = k.getString(9);
            int myDynamicColor;
            String wyswietl ="";
            String wyswietl2 ="";
            String wyswietl3 ="";



            if (k.getString(1).equals("OWB1")) {
                wyswietl = (textpokazwszystko.getText() + "\nData: " + k.getString(9));

                Spannable wordtoSpan = new SpannableString(wyswietl);

                wyswietl2 = "\nOWB1 - " + k.getString(2) + " km" + "\nCzas: " + k.getString(6) + " min" + "\nTresc treningu: " + k.getString(7) + "\n";
                wyswietl += wyswietl2;
                wyswietl3 = wordtoSpan + wyswietl2;
                textpokazwszystko.setText(wyswietl3);
            } else if (k.getString(1).equals("OWB2")) {
                textpokazwszystko.setText(textpokazwszystko.getText() + "\nData: " + k.getString(9) + "\nOWB2 - " + k.getString(2) + " km" + "\nCzas: " + k.getString(6) + " min" + "\nTresc treningu: " + k.getString(7) + "\n");
            } else if (k.getString(1).equals("OWB3")) {
                textpokazwszystko.setText(textpokazwszystko.getText() + "\nData: " + k.getString(9) + "\nOWB3 - " + k.getString(2) + " km" + "\nCzas: " + k.getString(6) + " min" + "\nTresc treningu: " + k.getString(7) + "\n");
            } else if (k.getString(1).equals("WT")) {
                textpokazwszystko.setText(textpokazwszystko.getText() + "\nData: " + k.getString(9) + "\nWYTRZYMAŁOŚĆ TEMPOWA  - " + k.getString(2) + " km" + "\nCzas: " + k.getString(6) + " min" + "\nTresc treningu: " + k.getString(7) + "\n");
            } else if (k.getString(1).equals("Wsz")) {
                textpokazwszystko.setText(textpokazwszystko.getText() + "\nData: " + k.getString(9) + "\nWYTRZYMAŁOŚĆ SZYBKOŚCIOWA - " + k.getString(3) + " m" + "\nCzas: " + k.getString(6) + " min" + "\nTresc treningu: " + k.getString(7) + "\n");
            } else if (k.getString(1).equals("ZB")) {
                textpokazwszystko.setText(textpokazwszystko.getText() + "\nData: " + k.getString(9) + "\nZABAWA BIEGOWA - " + k.getString(2) + " km" + "\nCzas: " + k.getString(6) + " min" + "\nTresc treningu: " + k.getString(7) + "\n");
            } else if (k.getString(1).equals("SZ")) {
                textpokazwszystko.setText(textpokazwszystko.getText() + "\nData: " + k.getString(9) + "\nSZYBKOŚĆ - " + k.getString(3) + " m" + "\nCzas: " + k.getString(6) + " min" + "\nTresc treningu: " + k.getString(7) + "\n");
            } else if (k.getString(1).equals("SzT")) {
                textpokazwszystko.setText(textpokazwszystko.getText() + "\nData: " + k.getString(9) + "\nSZYBKOŚĆ TECHNICZNA - " + k.getString(3) + " m" + "\nCzas: " + k.getString(6) + " min" + "\nTresc treningu: " + k.getString(7) + "\n");
            } else if (k.getString(1).equals("SB")) {
                textpokazwszystko.setText(textpokazwszystko.getText() + "\nData: " + k.getString(9) + "\nSIŁA BIEGOWA - " + k.getString(3) + " m" + "\nCzas: " + k.getString(6) + " min" + "\nTresc treningu: " + k.getString(7) + "\n");
            } else if (k.getString(1).equals("Siła")) {
                textpokazwszystko.setText(textpokazwszystko.getText() + "\nData: " + k.getString(9) + "\nSIŁA SPECJALNA - " + k.getString(5) + " kg" + "\nCzas: " + k.getString(6) + " min" + "\nTresc treningu: " + k.getString(7) + "\n");
            } else if (k.getString(1).equals("Spr")) {
                textpokazwszystko.setText(textpokazwszystko.getText() + "\nData: " + k.getString(9) + "\nSPRAWNOŚĆ - " + k.getString(4) + " powtórzenia" + "\nCzas: " + k.getString(6) + " min" + "\nTresc treningu: " + k.getString(7) + "\n");
            }
        }
    }
}
