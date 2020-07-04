package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        Intent caller = getIntent();
    }

    public void pumppeelrec1(View view) {
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, MainActivity22.class);
        startActivity(goToSecond);
    }

    public void pumppeelrec2(View view) {
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, MainActivity23.class);
        startActivity(goToSecond);
    }
}