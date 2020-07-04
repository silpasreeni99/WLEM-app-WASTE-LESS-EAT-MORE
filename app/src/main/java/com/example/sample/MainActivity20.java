package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity20 extends AppCompatActivity {
    Button curry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);
        curry=(Button)findViewById(R.id.button_orancurry);

        Intent caller = getIntent();
    }

    public void navigate9(View v) {
        openUrl("https://www.healthline.com/nutrition/can-you-eat-orange-peels");

    }
    public void openUrl(String url)
    {
        Uri uri= Uri.parse(url);
        Intent launchweb=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchweb);
    }
}