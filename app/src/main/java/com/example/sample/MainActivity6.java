package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Intent caller = getIntent();
    }

    public void hibrec1(View v) {
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, MainActivity12.class);
        startActivity(goToSecond);
    }

    public void hibrec2(View v) {
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, MainActivity13.class);
        startActivity(goToSecond);
    }
}