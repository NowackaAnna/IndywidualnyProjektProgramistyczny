package com.example.aplikacja;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.text.method.ScrollingMovementMethod;
import android.widget.Toast;

import java.util.List;

public class Podsumowaniedzien extends AppCompatActivity {
    Button wybierzdzien;
    TextView textpokaz;
    DatabaseHelper myDb;
    EditText editDzien;
    Button usundzien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podsumowaniedzien);

        myDb = new DatabaseHelper(this);
        wybierzdzien = (Button) findViewById(R.id.wybierzdzien);
        wybierzdzien.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Pokaz();
            }
        });

        TextView textpokaz = (TextView) findViewById(R.id.textpokaz);
        EditText editDzien = (EditText) findViewById(R.id.editDzien);

        usundzien = (Button) findViewById(R.id.usundzien);
        usundzien.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Usun();
            }
        });


    }

    public void Pokaz() {
        EditText editDzien = (EditText) findViewById(R.id.editDzien);
        String sprawdz;
        sprawdz = editDzien.getText().toString();
        TextView textpokaz = (TextView) findViewById(R.id.textpokaz);
        textpokaz.setText("");
        textpokaz.setMovementMethod(new ScrollingMovementMethod());
        for (Rekord k:myDb.pokazWybrane2(sprawdz)){
            textpokaz.setText(textpokaz.getText() + "\nNazwa środka: " + k.getSrodek()+ "\n* Kilometry: "+k.getKilometry()+"\n* Metry: "+k.getMetry()+"\n* Powtórzenia: "+k.getPowtorzenia()+"\n* Kilogramy: "+k.getKilogramy()+"\n* Czas(min): "+k.getCzas()+"\n* Treść: "+k.getTresc()+"\n");

        }





    }
    public void Usun(){
        EditText editDzien = (EditText) findViewById(R.id.editDzien);
        String sprawdz;
        sprawdz = editDzien.getText().toString();
        myDb.usunTrening(sprawdz);

    }

}
