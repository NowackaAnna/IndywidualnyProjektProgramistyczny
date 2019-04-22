package com.example.aplikacja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private Button wo1;

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


    }



    public void openSrodekwo1() {
        Intent intent = new Intent(this, Srodekwo1.class);
        startActivity(intent);
    }


}
