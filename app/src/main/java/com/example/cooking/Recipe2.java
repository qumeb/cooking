package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Recipe2 extends AppCompatActivity {
    long minutes;
    Button start_btn;
    private TextView timer_text;
    CountDownTimer timer;
    Vibrator vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe2);
        start_btn = findViewById(R.id.button5);
        timer_text = findViewById(R.id.textView8);
        minutes = 1200000;
        vibrator = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        start_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(timer!=null)
                {
                    timer.cancel();
                    timer = null;
                    timer_text.setText("20:00");

                    start_btn.setText(getString(R.string.start));

                    return;
                }

                start_btn.setText(getString(R.string.end));


                timer = new CountDownTimer(minutes, 1000) {
                    @Override
                    public void onTick(long l) {
                        NumberFormat f = new DecimalFormat("00");
                        long sec = l/1000;
                        long min = sec/60;
                        sec = sec%60;
                        String time = f.format(min) + ":" + f.format(sec);
                        timer_text.setText(time);
                    }

                    @Override
                    public void onFinish() {
                        start_btn.setText(getString(R.string.start));
                        start_btn.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        vibrator.vibrate(500);
                    }
                };
                timer.start();
            }
        });
    }
}