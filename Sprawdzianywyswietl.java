package com.example.aplikacja;

import android.database.Cursor;
import android.graphics.Color;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Sprawdzianywyswietl extends AppCompatActivity {
    Button pokazwszytskospr;
    TextView textpokazwszytskospr;
    TextView pasekkolor3;
    TextView pasekkolor4;
    DatabaseHelperSpr mDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sprawdzianywyswietl);

        mDb = new DatabaseHelperSpr(this);
        pokazwszytskospr = (Button) findViewById(R.id.pokazwszystkospr);
        pokazwszytskospr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                PokazwszystkoSpr();
            }
        });

        TextView textpokazwszystkospr = (TextView) findViewById(R.id.textpokazwszystkospr);
        TextView pasekkolor3 = (TextView) findViewById(R.id.pasekkolor3);
        TextView pasekkolor4 = (TextView) findViewById(R.id.pasekkolor4);

    }

    public void PokazwszystkoSpr(){
        TextView pasekkolor3 = (TextView) findViewById(R.id.pasekkolor3);
        pasekkolor3.setBackgroundResource(R.drawable.pasek);
        TextView pasekkolor4 = (TextView) findViewById(R.id.pasekkolor4);
        pasekkolor4.setBackgroundResource(R.drawable.pasek);
        TextView textpokazwszystkospr = (TextView) findViewById(R.id.textpokazwszystkospr);
        textpokazwszystkospr.setBackgroundResource(R.drawable.wszystkopokaz);
        textpokazwszystkospr.setText("");
        textpokazwszystkospr.setMovementMethod(new ScrollingMovementMethod());
        Cursor k = mDb.pokazWszystkieSpr();
        while (k.moveToNext()) {
            int nr = k.getInt(0);
            String dystans = k.getString(1);
            String czas = k.getString(2);
            String dodatkowe = k.getString(3);
            String data = k.getString(4);

            textpokazwszystkospr.setText(textpokazwszystkospr.getText() + "\n" +data+":\n" +dystans + " - "+czas+"\n"+dodatkowe+"\n");}
    }
}
