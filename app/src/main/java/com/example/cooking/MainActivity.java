package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void settings(View view) {
        Intent intent = new Intent(MainActivity.this, Settings.class);
        startActivity(intent);
    }
    public void breakfastOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, Breakfast.class);
        startActivity(intent);
    }
    public void lunchOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, Lunch.class);
        startActivity(intent);
    }
    public void dinnerOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, Dinner.class);
        startActivity(intent);
    }
}
