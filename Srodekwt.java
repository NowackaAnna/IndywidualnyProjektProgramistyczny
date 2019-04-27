package com.example.aplikacja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;


public class Srodekwt extends AppCompatActivity {
    EditText editDatawt;
    EditText editKilometrywt;
    EditText editCzasTrwaniawt;
    EditText editTrescwt;
    Button Dodajwt;
    String nicwt = " ";
    DatabaseHelper myDb;
    String nazwaSrodkawt = "WT";







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_srodekwt);
        myDb = new DatabaseHelper(this);



        editDatawt = (EditText) findViewById(R.id.editDatawt);
        editKilometrywt = (EditText) findViewById(R.id.editKilometrywt);
        editCzasTrwaniawt = (EditText) findViewById(R.id.editCzasTrwaniawt);
        editTrescwt = (EditText) findViewById(R.id.editTrescwt);
        Dodajwt = (Button) findViewById(R.id.Dodajwt);
        AddDatawt();


    }
    public void AddDatawt(){
        Dodajwt.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        myDb.insertData(nazwaSrodkawt,editKilometrywt.getText().toString(),"","","",editCzasTrwaniawt.getText().toString(),editTrescwt.getText().toString(),"",editDatawt.getText().toString());
                        Toast.makeText(Srodekwt.this,"Dane zostały zapisane.",Toast.LENGTH_LONG).show();

                    }
                }
        );
    }
}
