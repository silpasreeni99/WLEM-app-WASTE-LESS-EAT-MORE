package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        Intent caller = getIntent();
    }

    public void banpeelrec1(View v) {
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, MainActivity14.class);
        startActivity(goToSecond);
    }

    public void banpeelrec2(View v) {
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, MainActivity15.class);
        startActivity(goToSecond);
    }
}