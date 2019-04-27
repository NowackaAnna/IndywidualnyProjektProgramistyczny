package com.example.aplikacja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;


public class Srodeksila extends AppCompatActivity {
    EditText editDatasila;
    EditText editKilogramysila;
    EditText editCzasTrwaniasila;
    EditText editTrescsila;
    Button Dodajsila;
    String nicsila = " ";
    DatabaseHelper myDb;
    String nazwaSrodkasila = "Siła";







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_srodeksila);
        myDb = new DatabaseHelper(this);



        editDatasila = (EditText) findViewById(R.id.editDatasila);
        editKilogramysila = (EditText) findViewById(R.id.editKilogramysila);
        editCzasTrwaniasila = (EditText) findViewById(R.id.editCzasTrwaniasila);
        editTrescsila = (EditText) findViewById(R.id.editTrescsila);
        Dodajsila = (Button) findViewById(R.id.Dodajsila);
        AddDatasila();


    }
    public void AddDatasila(){
        Dodajsila.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        myDb.insertData(nazwaSrodkasila,"","","",editKilogramysila.getText().toString(),editCzasTrwaniasila.getText().toString(),editTrescsila.getText().toString(),"",editDatasila.getText().toString());
                        Toast.makeText(Srodeksila.this,"Dane zostały zapisane.",Toast.LENGTH_LONG).show();

                    }
                }
        );
    }
}
