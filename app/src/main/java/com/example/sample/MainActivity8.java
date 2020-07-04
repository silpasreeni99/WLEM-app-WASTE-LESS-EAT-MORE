package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        Intent caller = getIntent();
    }

    public void banstemrec1(View v) {
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, MainActivity16.class);
        startActivity(goToSecond);
    }

    public void banstemrec2(View v) {
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, MainActivity17.class);
        startActivity(goToSecond);
    }


}