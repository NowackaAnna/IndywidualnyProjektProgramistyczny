package com.example.aplikacja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;


public class Srodeksb extends AppCompatActivity {
    EditText editDatasb;
    EditText editMetrysb;
    EditText editCzasTrwaniasb;
    EditText editTrescsb;
    Button Dodajsb;
    String nicsb = " ";
    DatabaseHelper myDb;
    String nazwaSrodkasb = "SB";







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_srodeksb);
        myDb = new DatabaseHelper(this);



        editDatasb = (EditText) findViewById(R.id.editDatasb);
        editMetrysb = (EditText) findViewById(R.id.editMetrysb);
        editCzasTrwaniasb = (EditText) findViewById(R.id.editCzasTrwaniasb);
        editTrescsb = (EditText) findViewById(R.id.editTrescsb);
        Dodajsb = (Button) findViewById(R.id.Dodajsb);
        AddDatasb();


    }
    public void AddDatasb(){
        Dodajsb.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        myDb.insertData(nazwaSrodkasb,"",editMetrysb.getText().toString(),"","",editCzasTrwaniasb.getText().toString(),editTrescsb.getText().toString(),"",editDatasb.getText().toString());
                        Toast.makeText(Srodeksb.this,"Dane zostały zapisane.",Toast.LENGTH_LONG).show();

                    }
                }
        );
    }
}
