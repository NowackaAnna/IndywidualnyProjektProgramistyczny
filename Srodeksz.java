package com.example.aplikacja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;


public class Srodeksz extends AppCompatActivity {
    EditText editDatasz;
    EditText editMetrysz;
    EditText editCzasTrwaniasz;
    EditText editTrescsz;
    Button Dodajsz;
    String nicsz = " ";
    DatabaseHelper myDb;
    String nazwaSrodkasz = "SZ";







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_srodeksz);
        myDb = new DatabaseHelper(this);



        editDatasz = (EditText) findViewById(R.id.editDatasz);
        editMetrysz = (EditText) findViewById(R.id.editMetrysz);
        editCzasTrwaniasz = (EditText) findViewById(R.id.editCzasTrwaniasz);
        editTrescsz = (EditText) findViewById(R.id.editTrescsz);
        Dodajsz = (Button) findViewById(R.id.Dodajsz);
        AddDatasz();


    }
    public void AddDatasz(){
        Dodajsz.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        myDb.insertData(nazwaSrodkasz,"",editMetrysz.getText().toString(),"","",editCzasTrwaniasz.getText().toString(),editTrescsz.getText().toString(),"",editDatasz.getText().toString());
                        Toast.makeText(Srodeksz.this,"Dane zostały zapisane.",Toast.LENGTH_LONG).show();

                    }
                }
        );
    }
}
