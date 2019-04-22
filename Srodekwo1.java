package com.example.aplikacja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;


public class Srodekwo1 extends AppCompatActivity {
    EditText editData;
    EditText editKilometry;
    EditText editCzasTrwania;
    EditText editTresc;
    Button Dodaj;
    String nic = " ";
    DatabaseHelper myDb;
    String nazwaSrodka = "OWB1";







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_srodekwo1);
        myDb = new DatabaseHelper(this);



        editData = (EditText) findViewById(R.id.editData);
        editKilometry = (EditText) findViewById(R.id.editKilometry);
        editCzasTrwania = (EditText) findViewById(R.id.editCzasTrwania);
        editTresc = (EditText) findViewById(R.id.editTresc);
        Dodaj = (Button) findViewById(R.id.Dodaj);
        AddData();


    }
    public void AddData(){
        Dodaj.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        myDb.insertData(nazwaSrodka,editKilometry.getText().toString(),"","","",editCzasTrwania.getText().toString(),editTresc.getText().toString(),"",editData.getText().toString());
                        Toast.makeText(Srodekwo1.this,"Dane zostały zapisane.",Toast.LENGTH_LONG).show();

                    }
                }
                );
    }
}
