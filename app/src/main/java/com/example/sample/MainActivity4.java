package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Intent caller = getIntent();
        // get the rating passed by the first activity
        float rating = caller.getFloatExtra("nbStars", 0);

        // retrieve a reference to the View defined in the activity_second.xml
        TextView textView = (TextView) findViewById(R.id.textView);
        // set the text of the textView
        textView.setText("Welcome to the Rating Section!\n" +
                "Your rating: " + rating+ "\n" +
                " Thank you for your Rating, Hope you were satisfied with the service.");
    }
}