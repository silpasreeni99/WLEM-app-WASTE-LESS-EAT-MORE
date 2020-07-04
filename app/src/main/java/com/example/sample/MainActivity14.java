package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity14 extends AppCompatActivity {
    Button bancake;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);

        bancake=(Button) findViewById(R.id.button_bancake1);
        Intent caller = getIntent();
    }

    public void navigate3(View v) {
        openUrl("https://www.healthline.com/nutrition/can-you-eat-banana-peel#:~:text=Banana%20peel%20benefits&text=In%20fact%2C%20banana%20peels%20are,boost%20heart%20health%20(%202%20).");

    }
    public void openUrl(String url)
    {
        Uri uri= Uri.parse(url);
        Intent launchweb=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchweb);
    }
}