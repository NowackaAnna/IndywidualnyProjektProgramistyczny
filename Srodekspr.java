package com.example.aplikacja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;


public class Srodekspr extends AppCompatActivity {
    EditText editDataspr;
    EditText editPowtorzeniaspr;
    EditText editCzasTrwaniaspr;
    EditText editTrescspr;
    Button Dodajspr;
    String nicspr = " ";
    DatabaseHelper myDb;
    String nazwaSrodkaspr = "Spr";







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_srodekspr);
        myDb = new DatabaseHelper(this);



        editDataspr = (EditText) findViewById(R.id.editDataspr);
        editPowtorzeniaspr = (EditText) findViewById(R.id.editPowtorzeniaspr);
        editCzasTrwaniaspr = (EditText) findViewById(R.id.editCzasTrwaniaspr);
        editTrescspr = (EditText) findViewById(R.id.editTrescspr);
        Dodajspr = (Button) findViewById(R.id.Dodajspr);
        AddDataspr();


    }
    public void AddDataspr(){
        Dodajspr.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        myDb.insertData(nazwaSrodkaspr,"","",editPowtorzeniaspr.getText().toString(),"",editCzasTrwaniaspr.getText().toString(),editTrescspr.getText().toString(),"",editDataspr.getText().toString());
                        Toast.makeText(Srodekspr.this,"Dane zostały zapisane.",Toast.LENGTH_LONG).show();

                    }
                }
        );
    }
}
