package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.RatingBar;


public class MainActivity extends AppCompatActivity {
    Button buttonpro,buttonlan,buttonrat;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonlan = (Button) findViewById(R.id.button_lang);
        buttonpro = (Button) findViewById(R.id.button_products);
        buttonrat = (Button) findViewById(R.id.button_rating);

    }

    public void languagesopt(View v) {
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, MainActivity2.class);
        startActivity(goToSecond);
    }

    public void ratingsec(View v) {

        Intent goToSecond = new Intent();
        goToSecond.setClass(this, MainActivity3.class);
        startActivity(goToSecond);

    }

    public void productlist(View v) {
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, MainActivity5.class);
        startActivity(goToSecond);
    }
}