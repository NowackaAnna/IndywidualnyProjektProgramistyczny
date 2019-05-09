package com.example.aplikacja;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.text.method.ScrollingMovementMethod;
import android.widget.Toast;

import java.util.List;

public class Podsumowaniemiesiac extends AppCompatActivity {

    EditText editRok;
    EditText editMiesiac;
    Button wybierzmiesiac;
    TextView textpokazz;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podsumowaniemiesiac);


        myDb = new DatabaseHelper(this);
        wybierzmiesiac = (Button) findViewById(R.id.wybierzmiesiac);
        wybierzmiesiac.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Pokazmiesiac();
            }
        });

        TextView textpokazz = (TextView) findViewById(R.id.textpokazz);
        EditText editRok = (EditText) findViewById(R.id.editRok);
        EditText editMiesiac = (EditText) findViewById(R.id.editMiesiac);


    }

    public void Pokazmiesiac(){

        EditText editRok = (EditText) findViewById(R.id.editRok);
        EditText editMiesiac = (EditText) findViewById(R.id.editMiesiac);
        String sprawdz1;
        String sprawdz2;
        String sprawdz3;
        String akcent1 = "OWB1";
        String akcent2 = "OWB2";
        String akcent3 = "OWB3";
        String akcentwt = "WT";
        String akcentwsz = "Wsz";
        String akcentzb = "ZB";
        String akcentsz = "SZ";
        String akcentszt = "SzT";
        String akcentsb = "SB";
        String akcentsila = "Siła";
        String akcentspr = "Spr";


        String kilometryOWB1 = "";
        int kilometryyOWB1 = 0;
        String czasOWB1 ="";
        int czassOWB1 = 0;

        String kilometryOWB2 = "";
        int kilometryyOWB2 = 0;
        String czasOWB2 ="";
        int czassOWB2 = 0;

        String kilometryOWB3 = "";
        int kilometryyOWB3 = 0;
        String czasOWB3 ="";
        int czassOWB3 = 0;

        String kilometryWT = "";
        int kilometryyWT = 0;
        String czasWT ="";
        int czassWT = 0;

        String metryWsz = "";
        int metryyWsz = 0;
        String czasWsz ="";
        int czassWsz = 0;

        String kilometryZB = "";
        int kilometryyZB = 0;
        String czasZB ="";
        int czassZB = 0;

        String metrySZ = "";
        int metryySZ = 0;
        String czasSZ ="";
        int czassSZ = 0;

        String metrySzT = "";
        int metryySzT = 0;
        String czasSzT ="";
        int czassSzT = 0;

        String metrySB = "";
        int metryySB = 0;
        String czasSB ="";
        int czassSB = 0;

        String kilogramySila = "";
        int kilogramyySila = 0;
        String czasSila ="";
        int czassSila = 0;

        String powtorzeniaSpr = "";
        int powtorzeniaaSpr = 0;
        String czasSpr ="";
        int czassSpr = 0;


        sprawdz1 = editRok.getText().toString();
        sprawdz2 = editMiesiac.getText().toString();
        sprawdz3 = sprawdz1+"-"+sprawdz2+"-";
        String pokaz ="";
        TextView textpokazz = (TextView) findViewById(R.id.textpokazz);
        textpokazz.setText("");
        textpokazz.setMovementMethod(new ScrollingMovementMethod());


        for (int i = 1; i<=31;i++) {
            String dzien = Integer.toString(i);
            String sprawdzdzien = sprawdz3+dzien;
            for (Rekord k : myDb.pokazWybrane2(sprawdzdzien)) {
                if (k.getSrodek().equals(akcent1)) {
                    kilometryOWB1 = k.getKilometry();
                    czasOWB1 = k.getCzas();
                    try {
                        int resultOWB1 = Integer.parseInt(kilometryOWB1);
                        kilometryyOWB1 += resultOWB1;
                    }
                    catch (NumberFormatException n){
                        int resultOWB1 = 0;
                        kilometryyOWB1 += resultOWB1;
                    }
                    try {
                        int resultcOWB1 = Integer.parseInt(czasOWB1);
                        czassOWB1 += resultcOWB1;
                    }
                    catch (NumberFormatException n){
                        int resultcOWB1 = 0;
                        czassOWB1 += resultcOWB1;
                    }



                }

                else if (k.getSrodek().equals(akcent2)) {
                    kilometryOWB2 = k.getKilometry();
                    czasOWB2 = k.getCzas();
                    try {
                        int resultOWB2 = Integer.parseInt(kilometryOWB2);
                        kilometryyOWB2 += resultOWB2;
                    }
                    catch (NumberFormatException n){
                        int resultOWB2 = 0;
                        kilometryyOWB2 += resultOWB2;
                    }
                    try {
                        int resultcOWB2 = Integer.parseInt(czasOWB2);
                        czassOWB2 += resultcOWB2;
                    }
                    catch (NumberFormatException n){
                        int resultcOWB2 = 0;
                        czassOWB2 += resultcOWB2;
                    }



                }

                else if (k.getSrodek().equals(akcent3)) {
                    kilometryOWB3 = k.getKilometry();
                    czasOWB3 = k.getCzas();
                    try {
                        int resultOWB3 = Integer.parseInt(kilometryOWB3);
                        kilometryyOWB3 += resultOWB3;
                    }
                    catch (NumberFormatException n){
                        int resultOWB3 = 0;
                        kilometryyOWB3 += resultOWB3;
                    }
                    try {
                        int resultcOWB3 = Integer.parseInt(czasOWB3);
                        czassOWB3 += resultcOWB3;
                    }
                    catch (NumberFormatException n){
                        int resultcOWB3 = 0;
                        czassOWB3 += resultcOWB3;
                    }
                }

                else if (k.getSrodek().equals(akcentwt)) {
                    kilometryWT = k.getKilometry();
                    czasWT = k.getCzas();
                    try {
                        int resultWT = Integer.parseInt(kilometryWT);
                        kilometryyWT += resultWT;
                    }
                    catch (NumberFormatException n){
                        int resultWT = 0;
                        kilometryyWT += resultWT;
                    }
                    try {
                        int resultcWT = Integer.parseInt(czasWT);
                        czassWT += resultcWT;
                    }
                    catch (NumberFormatException n){
                        int resultcWT = 0;
                        czassWT += resultcWT;
                    }
                }

                else if (k.getSrodek().equals(akcentwsz)) {
                    metryWsz = k.getMetry();
                    czasWsz = k.getCzas();
                    try {
                        int resultWsz = Integer.parseInt(metryWsz);
                        metryyWsz += resultWsz;
                    }
                    catch (NumberFormatException n){
                        int resultWsz = 0;
                        metryyWsz += resultWsz;
                    }
                    try {
                        int resultcWsz = Integer.parseInt(czasWsz);
                        czassWsz += resultcWsz;
                    }
                    catch (NumberFormatException n){
                        int resultcWsz = 0;
                        czassWsz += resultcWsz;
                    }
                }

                else if (k.getSrodek().equals(akcentzb)) {
                    kilometryZB = k.getKilometry();
                    czasZB = k.getCzas();
                    try {
                        int resultZB = Integer.parseInt(kilometryZB);
                        kilometryyZB += resultZB;
                    }
                    catch (NumberFormatException n){
                        int resultZB = 0;
                        kilometryyZB += resultZB;
                    }
                    try {
                        int resultcZB = Integer.parseInt(czasZB);
                        czassZB += resultcZB;
                    }
                    catch (NumberFormatException n){
                        int resultcZB = 0;
                        czassZB += resultcZB;
                    }
                }

                else if (k.getSrodek().equals(akcentsz)) {
                    metrySZ = k.getMetry();
                    czasSZ = k.getCzas();
                    try {
                        int resultSZ = Integer.parseInt(metrySZ);
                        metryySZ += resultSZ;
                    }
                    catch (NumberFormatException n){
                        int resultSZ = 0;
                        metryySZ += resultSZ;
                    }
                    try {
                        int resultcSZ = Integer.parseInt(czasSZ);
                        czassSZ += resultcSZ;
                    }
                    catch (NumberFormatException n){
                        int resultcSZ = 0;
                        czassSZ += resultcSZ;
                    }
                }

                else if (k.getSrodek().equals(akcentszt)) {
                    metrySzT = k.getMetry();
                    czasSzT = k.getCzas();
                    try {
                        int resultSzT = Integer.parseInt(metrySzT);
                        metryySzT += resultSzT;
                    }
                    catch (NumberFormatException n){
                        int resultSzT = 0;
                        metryySzT += resultSzT;
                    }
                    try {
                        int resultcSzT = Integer.parseInt(czasSzT);
                        czassSzT += resultcSzT;
                    }
                    catch (NumberFormatException n){
                        int resultcSzT = 0;
                        czassSzT += resultcSzT;
                    }
                }

                else if (k.getSrodek().equals(akcentsb)) {
                    metrySB = k.getMetry();
                    czasSB = k.getCzas();
                    try {
                        int resultSB = Integer.parseInt(metrySB);
                        metryySB += resultSB;
                    }
                    catch (NumberFormatException n){
                        int resultSB = 0;
                        metryySB += resultSB;
                    }
                    try {
                        int resultcSB = Integer.parseInt(czasSB);
                        czassSB += resultcSB;
                    }
                    catch (NumberFormatException n){
                        int resultcSB = 0;
                        czassSB += resultcSB;
                    }
                }

                else if (k.getSrodek().equals(akcentsila)) {
                    kilogramySila = k.getKilogramy();
                    czasSila = k.getCzas();
                    try {
                        int resultSila = Integer.parseInt(kilogramySila);
                        kilogramyySila += resultSila;
                    }
                    catch (NumberFormatException n){
                        int resultSila = 0;
                        kilogramyySila += resultSila;
                    }
                    try {
                        int resultcSila = Integer.parseInt(czasSila);
                        czassSila += resultcSila;
                    }
                    catch (NumberFormatException n){
                        int resultcSila = 0;
                        czassSila += resultcSila;
                    }
                }

                else if (k.getSrodek().equals(akcentspr)) {
                    powtorzeniaSpr = k.getPowtorzenia();
                    czasSpr = k.getCzas();
                    try {
                        int resultSpr = Integer.parseInt(powtorzeniaSpr);
                        powtorzeniaaSpr += resultSpr;
                    }
                    catch (NumberFormatException n){
                        int resultSpr = 0;
                        powtorzeniaaSpr += resultSpr;
                    }
                    try {
                        int resultcSpr = Integer.parseInt(czasSpr);
                        czassSpr += resultcSpr;
                    }
                    catch (NumberFormatException n){
                        int resultcSpr = 0;
                        czassSpr += resultcSpr;
                    }
                }

                }




            }
        String kilometrypokazOWB1 = Integer.toString(kilometryyOWB1);
        String kilometrypokazOWB2 = Integer.toString(kilometryyOWB2);
        String kilometrypokazOWB3 = Integer.toString(kilometryyOWB3);
        String kilometrypokazWT = Integer.toString(kilometryyWT);
        String metrypokazWsz = Integer.toString(metryyWsz);
        String kilometrypokazZB = Integer.toString(kilometryyZB);
        String metrypokazSZ = Integer.toString(metryySZ);
        String metrypokazSzT = Integer.toString(metryySzT);
        String metrypokazSB = Integer.toString(metryySB);
        String kilogramypokazSila = Integer.toString(kilogramyySila);
        String powtorzeniapokazSpr = Integer.toString(powtorzeniaaSpr);
        String czaspokazSpr = Integer.toString(czassSpr);
        int czaslacznie = czassOWB1+czassOWB2+czassOWB3+czassWT+czassWsz+czassZB+czassSZ+czassSzT+czassSB+czassSila+czassSpr;
        String czastreningow = Integer.toString(czaslacznie);
        textpokazz.setText(textpokazz.getText()+"\nOWB1: "+kilometrypokazOWB1+"\nOWB2: "+kilometrypokazOWB2+"\nOWB3: "+kilometrypokazOWB3+"\nWT: "+kilometrypokazWT+"\nWsz: "+metrypokazWsz+"\nZB: "+kilometrypokazZB+"\nSZ: "+metrypokazSZ+"\nSzT: "+metrypokazSzT+"\nSB: "+metrypokazSB+"\nSiła: "+kilogramypokazSila+"\nSpr: "+powtorzeniapokazSpr+"-"+czaspokazSpr+" min"+"\nCałkowity czas treningów: "+czastreningow+" min");
        }



}
