package com.example.aplikacja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private Button wo1;
    private Button wo2;
    private Button wo3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button wo1 = (Button) findViewById(R.id.wo1);
        wo1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openSrodekwo1();
            }
        });

        Button wo2 = (Button) findViewById(R.id.wo2);
        wo2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openSrodekwo2();
            }
        });

        Button wo3 = (Button) findViewById(R.id.wo3);
        wo3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openSrodekwo3();
            }
        });


    }



    public void openSrodekwo1() {
        Intent intent = new Intent(this, Srodekwo1.class);
        startActivity(intent);
    }

    public void openSrodekwo2() {
        Intent intent = new Intent(this, Srodekwo2.class);
        startActivity(intent);

    }

    public void openSrodekwo3() {
        Intent intent = new Intent(this, Srodekwo3.class);
        startActivity(intent);

    }


}
