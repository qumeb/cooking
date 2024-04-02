package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Breakfast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);
    }
    public void recipe1OnClick(View view) {
        Intent intent = new Intent(Breakfast.this, Recipe1.class);
        startActivity(intent);
    }
    public void recipe2OnClick(View view) {
        Intent intent = new Intent(Breakfast.this, Recipe2.class);
        startActivity(intent);
    }
    public void settings(View view) {
        Intent intent = new Intent(Breakfast.this, Settings.class);
        startActivity(intent);
    }
}