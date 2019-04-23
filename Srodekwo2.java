package com.example.aplikacja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;


public class Srodekwo2 extends AppCompatActivity {
    EditText editData2;
    EditText editKilometry2;
    EditText editCzasTrwania2;
    EditText editTresc2;
    Button Dodaj2;
    String nic2 = " ";
    DatabaseHelper myDb;
    String nazwaSrodka2 = "OWB2";







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_srodekwo2);
        myDb = new DatabaseHelper(this);



        editData2 = (EditText) findViewById(R.id.editData2);
        editKilometry2 = (EditText) findViewById(R.id.editKilometry2);
        editCzasTrwania2 = (EditText) findViewById(R.id.editCzasTrwania2);
        editTresc2 = (EditText) findViewById(R.id.editTresc2);
        Dodaj2 = (Button) findViewById(R.id.Dodaj2);
        AddData2();


    }
    public void AddData2(){
        Dodaj2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        myDb.insertData(nazwaSrodka2,editKilometry2.getText().toString(),"","","",editCzasTrwania2.getText().toString(),editTresc2.getText().toString(),"",editData2.getText().toString());
                        Toast.makeText(Srodekwo2.this,"Dane zostały zapisane.",Toast.LENGTH_LONG).show();

                    }
                }
        );
    }
}
