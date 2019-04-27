package com.example.aplikacja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;


public class Srodekszt extends AppCompatActivity {
    EditText editDataszt;
    EditText editMetryszt;
    EditText editCzasTrwaniaszt;
    EditText editTrescszt;
    Button Dodajszt;
    String nicszt = " ";
    DatabaseHelper myDb;
    String nazwaSrodkaszt = "SzT";







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_srodekszt);
        myDb = new DatabaseHelper(this);



        editDataszt = (EditText) findViewById(R.id.editDataszt);
        editMetryszt = (EditText) findViewById(R.id.editMetryszt);
        editCzasTrwaniaszt = (EditText) findViewById(R.id.editCzasTrwaniaszt);
        editTrescszt = (EditText) findViewById(R.id.editTrescszt);
        Dodajszt = (Button) findViewById(R.id.Dodajszt);
        AddDataszt();


    }
    public void AddDataszt(){
        Dodajszt.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        myDb.insertData(nazwaSrodkaszt,"",editMetryszt.getText().toString(),"","",editCzasTrwaniaszt.getText().toString(),editTrescszt.getText().toString(),"",editDataszt.getText().toString());
                        Toast.makeText(Srodekszt.this,"Dane zostały zapisane.",Toast.LENGTH_LONG).show();

                    }
                }
        );
    }
}
