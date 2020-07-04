package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {
    Button hib;
    Button banpeel;
    Button banstem;
    Button rice;
    Button oranpeel;
    Button pumppeel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        hib=(Button) findViewById(R.id.button_hib);
        banpeel=(Button) findViewById(R.id.button_banpeel);
        banstem=(Button) findViewById(R.id.button_banstem);
        rice=(Button) findViewById(R.id.button_rice);
        oranpeel=(Button) findViewById(R.id.button_orangepeel);
        pumppeel=(Button) findViewById(R.id.button_pumppeel);
        Intent caller = getIntent();
    }


    public void hibrecipes(View v) {
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, MainActivity6.class);
        startActivity(goToSecond);
    }


    public void banpeelrecipes(View v) {
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, MainActivity7.class);
        startActivity(goToSecond);
    }


    public void banstemrecipes(View v) {
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, MainActivity8.class);
        startActivity(goToSecond);
    }


    public void ricerecipes(View v) {
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, MainActivity9.class);
        startActivity(goToSecond);
    }


    public void oranpeelrecipes(View v) {
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, MainActivity10.class);
        startActivity(goToSecond);
    }


    public void pumppeelrecipes(View v) {
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, MainActivity11.class);
        startActivity(goToSecond);
    }
}