package com.example.animation;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button rabitBtn;
    private Button blinckitBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Animation startanimation = AnimationUtils.loadAnimation(this, R.anim.start_animation);

        rabitBtn = findViewById(R.id.rabitBtn);

        blinckitBtn = findViewById(R.id.tweenBtn);


        rabitBtn.startAnimation(startanimation);
        blinckitBtn.startAnimation(startanimation);


        rabitBtn.setOnClickListener (v ->{
            Intent intent = new Intent(this, RabitActivity.class);
            startActivity(intent);

        });

        blinckitBtn.setOnClickListener (v ->{
            Intent intent = new Intent(this, BlinckActivity.class);
            startActivity(intent);
        });


    }
}