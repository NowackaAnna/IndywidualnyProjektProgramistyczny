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
    private Button wsz;
    private Button wt;
    private Button zb;
    private Button szybkosc;
    private Button st;
    private Button sb;
    private Button sila;
    private Button spr;

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

        Button wsz = (Button) findViewById(R.id.wsz);
        wsz.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openSrodekwsz();
            }
        });

        Button wt = (Button) findViewById(R.id.wt);
        wt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openSrodekwt();
            }
        });

        Button zb = (Button) findViewById(R.id.zb);
        zb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openSrodekzb();
            }
        });

        Button szybkosc = (Button) findViewById(R.id.szybkosc);
        szybkosc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openSrodeksz();
            }
        });

        Button st = (Button) findViewById(R.id.st);
        st.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openSrodekszt();
            }
        });

        Button sb = (Button) findViewById(R.id.sb);
        sb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openSrodeksb();
            }
        });

        Button sila = (Button) findViewById(R.id.sila);
        sila.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openSrodeksila();
            }
        });

        Button spr = (Button) findViewById(R.id.spr);
        spr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openSrodekspr();
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

    public void openSrodekwsz() {
        Intent intent = new Intent(this, Srodekwsz.class);
        startActivity(intent);
    }

    public void openSrodekwt() {
        Intent intent = new Intent(this, Srodekwt.class);
        startActivity(intent);
    }

    public void openSrodekzb() {
        Intent intent = new Intent(this, Srodekzb.class);
        startActivity(intent);
    }

    public void openSrodeksz() {
        Intent intent = new Intent(this, Srodeksz.class);
        startActivity(intent);
    }

    public void openSrodekszt() {
        Intent intent = new Intent(this, Srodekszt.class);
        startActivity(intent);
    }

    public void openSrodeksb() {
        Intent intent = new Intent(this, Srodeksb.class);
        startActivity(intent);
    }

    public void openSrodeksila() {
        Intent intent = new Intent(this, Srodeksila.class);
        startActivity(intent);
    }

    public void openSrodekspr() {
        Intent intent = new Intent(this, Srodekspr.class);
        startActivity(intent);
    }


}
