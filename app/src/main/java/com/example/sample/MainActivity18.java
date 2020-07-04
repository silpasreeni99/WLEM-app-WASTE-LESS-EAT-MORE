package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity18 extends AppCompatActivity {
    Button vada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);
        vada=(Button) findViewById(R.id.button_ricevada);


        Intent caller = getIntent();
    }

    public void navigate7(View v) {
        openUrl("https://zeenews.india.com/health/unbelievable-six-health-benefits-of-leftover-rice-from-glowing-skin-to-a-trimmer-waistline-1928834");

    }
    public void openUrl(String url)
    {
        Uri uri= Uri.parse(url);
        Intent launchweb=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchweb);
    }
}