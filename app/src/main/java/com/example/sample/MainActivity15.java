package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity15 extends AppCompatActivity {
    Button bancake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
        bancake=(Button) findViewById(R.id.button_bancake1);

        Intent caller = getIntent();
    }

    public void navigate4(View v) {
        openUrl("https://www.healthline.com/health/banana-peel-uses");

    }
    public void openUrl(String url)
    {
        Uri uri= Uri.parse(url);
        Intent launchweb=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchweb);
    }
}