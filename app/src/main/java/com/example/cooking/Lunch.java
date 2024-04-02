package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Lunch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);
    }
    public void recipe3OnClick(View view) {
        Intent intent = new Intent(Lunch.this, Recipe3.class);
        startActivity(intent);
    }
    public void recipe4OnClick(View view) {
        Intent intent = new Intent(Lunch.this, Recipe4.class);
        startActivity(intent);
    }
    public void settings(View view) {
        Intent intent = new Intent(Lunch.this, Settings.class);
        startActivity(intent);
    }
}