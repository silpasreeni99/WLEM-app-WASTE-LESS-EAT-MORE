package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        Intent caller = getIntent();
    }

    public void oranpeelrec1(View view) {
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, MainActivity20.class);
        startActivity(goToSecond);
    }

    public void oranpeelrec2(View view) {
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, MainActivity21.class);
        startActivity(goToSecond);
    }
}