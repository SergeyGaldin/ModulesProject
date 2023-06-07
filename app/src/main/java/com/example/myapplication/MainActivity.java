package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.activity1.Activity1;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnActivity1).setOnClickListener(view -> {
            startActivity(new Intent(this, Activity1.class));
        });

        findViewById(R.id.btnActivity2).setOnClickListener(view -> {

        });
    }
}