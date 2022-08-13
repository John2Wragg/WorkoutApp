package com.example.recyclerviewstest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialising Buttons and adding onClick listeners to redirect to workout pages.
        Button pushDay = findViewById(R.id.btnPush);
        Button pullDay = findViewById(R.id.btnPull);
        Button legDay = findViewById(R.id.btnLegs);

        pushDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PushDay.class);
                startActivity(intent);
            }
        });

        pullDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PullDay.class);
                startActivity(intent);
            }
        });

        legDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LegDay.class);
                startActivity(intent);
            }
        });


    }




}
