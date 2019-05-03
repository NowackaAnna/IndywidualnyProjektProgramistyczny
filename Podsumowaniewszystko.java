package com.example.aplikacja;

import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Podsumowaniewszystko extends AppCompatActivity {
    Button pokazwszytsko;
    TextView textpokazwszytsko;
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
    }

    public void Pokazwszystko(){
        TextView textpokazwszystko = (TextView) findViewById(R.id.textpokazwszystko);
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

            textpokazwszystko.setText(textpokazwszystko.getText() + "\n" +data+":\n" +srodek + "-"+kilometry+" km - "+metry+" m - \n"+powtorzenia+" powt - "+kilogramy+" kg - "+czas+" min"+"\nTresc: "+tresc+"\n");}
    }
}
