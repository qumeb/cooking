package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);
    }
    public void recipe4OnClick(View view) {
        Intent intent = new Intent(Dinner.this, Recipe5.class);
        startActivity(intent);
    }
}