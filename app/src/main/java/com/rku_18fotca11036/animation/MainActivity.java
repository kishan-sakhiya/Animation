package com.rku_18fotca11036.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);

//        this is only for alpha transparency
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.alpha);
        imageView.startAnimation(animation);

//        this for only rotate
//        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
//        imageView.startAnimation(animation);

//        translate
//        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
//        imageView.startAnimation(animation);

//        // this is scale
//        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
//        imageView.startAnimation(animation);

    }
}