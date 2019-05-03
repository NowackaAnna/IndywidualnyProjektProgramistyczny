package com.example.aplikacja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sprawdziny extends AppCompatActivity {
    private Button dodajsprzaw;
    private Button sprawdzsprzaw;
    private Button usunsprzaw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sprawdziny);


        Button dodajsprzaw = (Button) findViewById(R.id.dodajsprzaw);
        dodajsprzaw.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) { openSprawdzianydodaj();
            }
        });

        Button sprawdzsprzaw = (Button) findViewById(R.id.sprawdzsprzaw);
        sprawdzsprzaw.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) { openSprawdzianywyswietl();
            }
        });

        Button usunsprzaw = (Button) findViewById(R.id.usunsprzaw);
        usunsprzaw.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) { openSprawdzianyusun();
            }
        });

    }

    public void openSprawdzianydodaj() {
        Intent intent = new Intent(this, Sprawdzianydodaj.class);
        startActivity(intent);
    }
    public void openSprawdzianywyswietl() {
        Intent intent = new Intent(this, Sprawdzianywyswietl.class);
        startActivity(intent);
    }

    public void openSprawdzianyusun() {
        Intent intent = new Intent(this, Sprawdzianyusun.class);
        startActivity(intent);
    }
}
