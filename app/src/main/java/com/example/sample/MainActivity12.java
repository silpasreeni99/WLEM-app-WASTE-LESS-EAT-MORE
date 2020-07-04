package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;


public class MainActivity12 extends AppCompatActivity {

    Button tea;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);


        tea=(Button) findViewById(R.id.button_tea1);
        Intent caller = getIntent();
    }

    public void navigate1(View v) {
       openUrl("https://www.medicalnewstoday.com/articles/318120");

    }
    public void openUrl(String url)
    {
        Uri uri= Uri.parse(url);
        Intent launchweb=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchweb);
    }
}