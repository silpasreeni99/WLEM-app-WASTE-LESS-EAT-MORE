package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity16 extends AppCompatActivity {
    Button juice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);
        juice=(Button) findViewById(R.id.button_banstemjuice);

        Intent caller = getIntent();
    }

    public void navigate5(View v) {
        openUrl("https://www.femina.in/wellness/diet/5-benefits-of-banana-stem-41741.html");

    }
    public void openUrl(String url)
    {
        Uri uri= Uri.parse(url);
        Intent launchweb=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchweb);
    }
}