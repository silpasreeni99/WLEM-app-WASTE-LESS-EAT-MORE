package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        Intent caller = getIntent();
    }

    public void vadarec(View view) {
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, MainActivity18.class);
        startActivity(goToSecond);
    }

    public void puddingrec(View view) {
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, MainActivity19.class);
        startActivity(goToSecond);
    }
}