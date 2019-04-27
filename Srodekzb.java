package com.example.aplikacja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;


public class Srodekzb extends AppCompatActivity {
    EditText editDatazb;
    EditText editKilometryzb;
    EditText editCzasTrwaniazb;
    EditText editTresczb;
    Button Dodajzb;
    String niczb = " ";
    DatabaseHelper myDb;
    String nazwaSrodkazb = "ZB";







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_srodekzb);
        myDb = new DatabaseHelper(this);



        editDatazb = (EditText) findViewById(R.id.editDatazb);
        editKilometryzb = (EditText) findViewById(R.id.editKilometryzb);
        editCzasTrwaniazb = (EditText) findViewById(R.id.editCzasTrwaniazb);
        editTresczb = (EditText) findViewById(R.id.editTresczb);
        Dodajzb = (Button) findViewById(R.id.Dodajzb);
        AddDatazb();


    }
    public void AddDatazb(){
        Dodajzb.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        myDb.insertData(nazwaSrodkazb,editKilometryzb.getText().toString(),"","","",editCzasTrwaniazb.getText().toString(),editTresczb.getText().toString(),"",editDatazb.getText().toString());
                        Toast.makeText(Srodekzb.this,"Dane zostały zapisane.",Toast.LENGTH_LONG).show();

                    }
                }
        );
    }
}
