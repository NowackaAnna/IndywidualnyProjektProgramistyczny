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

public class Sprawdzianyusun extends AppCompatActivity {
    Button wybierzdzienspr;
    TextView textpokazspr;
    DatabaseHelperSpr mDb;
    EditText editDzienSpr;
    Button usunspr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sprawdzianyusun);

        mDb = new DatabaseHelperSpr(this);
        wybierzdzienspr = (Button) findViewById(R.id.wybierzdzienspr);
        wybierzdzienspr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                PokazSpr();
            }
        });

        TextView textpokazspr = (TextView) findViewById(R.id.textpokazspr);
        EditText editDzienSpr = (EditText) findViewById(R.id.editDzienSpr);

        usunspr = (Button) findViewById(R.id.usunspr);
        usunspr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                UsunSpr();
            }
        });


    }

    public void PokazSpr() {
        EditText editDzienSpr = (EditText) findViewById(R.id.editDzienSpr);
        String sprawdzspr;
        sprawdzspr = editDzienSpr.getText().toString();
        TextView textpokazspr = (TextView) findViewById(R.id.textpokazspr);
        textpokazspr.setText("");
        textpokazspr.setMovementMethod(new ScrollingMovementMethod());
        for (Sprawdzian k:mDb.pokazWybraneSpr(sprawdzspr)){
            textpokazspr.setText(textpokazspr.getText() + "\nDystans: " + k.getDystans()+ "\nCzas: "+k.getCzas()+"\nDodatkowe informacje: "+k.getDodatkowe_informacje()+"\n");

        }





    }
    public void UsunSpr(){
        EditText editDzienSpr = (EditText) findViewById(R.id.editDzienSpr);
        String sprawdzSpr;
        sprawdzSpr = editDzienSpr.getText().toString();
        mDb.usunSpr(sprawdzSpr);
        Toast.makeText(Sprawdzianyusun.this,"Dane zostały usunięte.",Toast.LENGTH_LONG).show();

    }

}
