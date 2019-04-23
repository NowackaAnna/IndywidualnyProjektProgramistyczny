package com.example.aplikacja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;


public class Srodekwo3 extends AppCompatActivity {
    EditText editData3;
    EditText editKilometry3;
    EditText editCzasTrwania3;
    EditText editTresc3;
    Button Dodaj3;
    String nic3 = " ";
    DatabaseHelper myDb;
    String nazwaSrodka3 = "OWB3";







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_srodekwo3);
        myDb = new DatabaseHelper(this);



        editData3 = (EditText) findViewById(R.id.editData3);
        editKilometry3 = (EditText) findViewById(R.id.editKilometry3);
        editCzasTrwania3 = (EditText) findViewById(R.id.editCzasTrwania3);
        editTresc3 = (EditText) findViewById(R.id.editTresc3);
        Dodaj3 = (Button) findViewById(R.id.Dodaj3);
        AddData3();


    }
    public void AddData3(){
        Dodaj3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        myDb.insertData(nazwaSrodka3,editKilometry3.getText().toString(),"","","",editCzasTrwania3.getText().toString(),editTresc3.getText().toString(),"",editData3.getText().toString());
                        Toast.makeText(Srodekwo3.this,"Dane zostały zapisane.",Toast.LENGTH_LONG).show();

                    }
                }
        );
    }
}
