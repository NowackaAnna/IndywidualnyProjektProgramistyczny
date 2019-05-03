package com.example.aplikacja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;


public class Sprawdzianydodaj extends AppCompatActivity {
    EditText editDataspr;
    EditText editDystans;
    EditText editCzasspr;
    EditText editDodatkoweSpr;
    Button ZapiszSpr;
    DatabaseHelperSpr mDb;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sprawdzianydodaj);
        mDb = new DatabaseHelperSpr(this);



        editDataspr = (EditText) findViewById(R.id.editDataspr);
        editDystans = (EditText) findViewById(R.id.editDystans);
        editCzasspr = (EditText) findViewById(R.id.editCzasspr);
        editDodatkoweSpr = (EditText) findViewById(R.id.editDodatkoweSpr);
        ZapiszSpr = (Button) findViewById(R.id.ZapiszSpr);
        Zapisz();


    }
    public void Zapisz(){
        ZapiszSpr.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        mDb.insertDataSpr(editDystans.getText().toString(),editCzasspr.getText().toString(),editDodatkoweSpr.getText().toString(),editDataspr.getText().toString());
                        Toast.makeText(Sprawdzianydodaj.this,"Dane zostały zapisane.",Toast.LENGTH_LONG).show();

                    }
                }
        );
    }
}
