package com.example.android.java;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView1;
    Animation blinkAnimation, slideUpAnimation, slideDownAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1 = (ImageView) findViewById(R.id.faceIcon);
    }

    public void slideUp(View view) {
        slideUpAnimation = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.sube);
        imageView1.startAnimation(slideUpAnimation);
    }

    public void blink(View view) {
        blinkAnimation = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.blink);
        imageView1.startAnimation(blinkAnimation);
    }

    public void slideDown(View view) {
        slideDownAnimation = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.baja);
        imageView1.startAnimation(slideDownAnimation);
    }



}