package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity17 extends AppCompatActivity {
    Button thoran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);
        thoran=(Button) findViewById(R.id.button_banrecthoran);

        Intent caller = getIntent();
    }

    public void navigate6(View v) {
        openUrl("https://livingfoodz.com/stories/6-health-benefits-of-the-banana-stem-you-didn-t-know-about-1130");

    }
    public void openUrl(String url)
    {
        Uri uri= Uri.parse(url);
        Intent launchweb=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchweb);
    }

}