package com.example.adli.mar;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            public void run() {

                Intent mainIntent = new Intent(splash.this, login.class);
                splash.this.startActivity(mainIntent);
                splash.this.finish();
            }
        }, 5000);
    }
}
