package com.example.aplikacja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Podsumowanie extends AppCompatActivity {
    private Button tydzien;
    private Button miesiac;
    private Button dzien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podsumowanie);

        Button tydzien = (Button) findViewById(R.id.tydzien);
        tydzien.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openPosumowanietydzien();
            }
        });

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

    }

    public void openPosumowanietydzien() {
        Intent intent = new Intent(this, Podsumowanietydzien.class);
        startActivity(intent);
    }
    public void openPodsumowaniemiesiac() {
        Intent intent = new Intent(this, Podsumowaniemiesiac.class);
        startActivity(intent);
    }
    public void openPodsumowaniedzien() {
        Intent intent = new Intent(this, Podsumowaniedzien.class);
        startActivity(intent);
    }
}
