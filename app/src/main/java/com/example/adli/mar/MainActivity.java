package com.example.adli.mar;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.darsname).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent next1 = new Intent(MainActivity.this, darsname.class);
                startActivity(next1);


            }
        });
        findViewById(R.id.cal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent next1 = new Intent(MainActivity.this, calculator.class);
                startActivity(next1);


            }
        });
        findViewById(R.id.dictionary).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent next1 = new Intent(MainActivity.this, dictionary.class);
                startActivity(next1);


            }
        });

        findViewById(R.id.text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent next1 = new Intent(MainActivity.this, text.class);
                startActivity(next1);


            }
        });



        findViewById(R.id.azmoon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent next1 = new Intent(MainActivity.this, azmoon.class);
                startActivity(next1);


            }
        });
        findViewById(R.id.sargarmi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent next1 = new Intent(MainActivity.this, Sodoku.class);
                startActivity(next1);


            }
        });
        findViewById(R.id.voicerecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent next1 = new Intent(MainActivity.this, voicerecoreder.class);
                startActivity(next1);


            }
        });

    }
}

