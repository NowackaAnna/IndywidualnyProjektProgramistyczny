package com.example.aplikacja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Podsumowanie extends AppCompatActivity {
    private Button miesiac;
    private Button dzien;
    private Button wszystko;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podsumowanie);


        Button miesiac = (Button) findViewById(R.id.miesiac);
        miesiac.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openPodsumowaniemiesiac();
            }
        });

        Button dzien = (Button) findViewById(R.id.dzien);
        dzien.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openPodsumowaniedzien();
            }
        });

        Button wszystko = (Button) findViewById(R.id.wszystko);
        wszystko.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openPodsumowaniewszystko();
            }
        });

    }

    public void openPodsumowaniemiesiac() {
        Intent intent = new Intent(this, Podsumowaniemiesiac.class);
        startActivity(intent);
    }
    public void openPodsumowaniedzien() {
        Intent intent = new Intent(this, Podsumowaniedzien.class);
        startActivity(intent);
    }

    public void openPodsumowaniewszystko() {
        Intent intent = new Intent(this, Podsumowaniewszystko.class);
        startActivity(intent);
    }
}
