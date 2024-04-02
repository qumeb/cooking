package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Recipe1 extends AppCompatActivity {
    long minutes;
    ImageButton imageButton;
    Button start_btn;
    private TextView timer_text;
    MediaPlayer  Voice;
    CountDownTimer timer;
    Vibrator vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe1);
        start_btn = findViewById(R.id.button5);
        timer_text = findViewById(R.id.textView8);
        imageButton = findViewById(R.id.imageButton3);
        Voice = MediaPlayer.create(this,R.raw.audio_first);


        minutes = 900000;
        start_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(timer!=null)
                {
                timer.cancel();
                timer = null;
                timer_text.setText("15:00");

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
                        vibrator = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
                        start_btn.setText(getString(R.string.start));
                        start_btn.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        vibrator.vibrate(500);
                    }
                };
                timer.start();
            }
        });
        final Context context = this;
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Voice.isPlaying()){
                    Voice.stop();
                    Voice.release();
                    Voice = MediaPlayer.create(context,R.raw.audio_first);
                    imageButton.setBackgroundColor(Color.WHITE);
                } else {
                    Voice.start();
                    imageButton.setBackgroundColor(Color.RED);
                }
            }
        });

    }
    public void recipe1OnClick(View view) {
        Intent intent = new Intent(Recipe1.this, Settings.class);
        startActivity(intent);
    }

}