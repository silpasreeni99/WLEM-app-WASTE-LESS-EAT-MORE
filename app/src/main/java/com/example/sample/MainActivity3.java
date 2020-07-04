package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent caller = getIntent();
    }
        public void enter(View v) {
            // retrieve a reference to the View defined in the activity_first.xml
            RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
            // get the rating set by the user
            float rating = ratingBar.getRating();
            // create an Intent to launch the second activity
            Intent goToSecond = new Intent();
            goToSecond.setClass(this, MainActivity4.class);
            // pass the rating value to the second activity
            goToSecond.putExtra("nbStars", rating);
            // start the second activity
            startActivity(goToSecond);
    }
}