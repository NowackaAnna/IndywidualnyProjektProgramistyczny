package com.example.aplikacja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;


public class Srodekwsz extends AppCompatActivity {
    EditText editDatawsz;
    EditText editMetrywsz;
    EditText editCzasTrwaniawsz;
    EditText editTrescwsz;
    Button Dodajwsz;
    String nicwsz = " ";
    DatabaseHelper myDb;
    String nazwaSrodkawsz = "Wsz";







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_srodekwsz);
        myDb = new DatabaseHelper(this);



        editDatawsz = (EditText) findViewById(R.id.editDatawsz);
        editMetrywsz = (EditText) findViewById(R.id.editMetrywsz);
        editCzasTrwaniawsz = (EditText) findViewById(R.id.editCzasTrwaniawsz);
        editTrescwsz = (EditText) findViewById(R.id.editTrescwsz);
        Dodajwsz = (Button) findViewById(R.id.Dodajwsz);
        AddDatawsz();


    }
    public void AddDatawsz(){
        Dodajwsz.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        myDb.insertData(nazwaSrodkawsz,"",editMetrywsz.getText().toString(),"","",editCzasTrwaniawsz.getText().toString(),editTrescwsz.getText().toString(),"",editDatawsz.getText().toString());
                        Toast.makeText(Srodekwsz.this,"Dane zostały zapisane.",Toast.LENGTH_LONG).show();

                    }
                }
        );
    }
}
