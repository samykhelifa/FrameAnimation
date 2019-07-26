package com.ryio6.frameanimation;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void startFrameAnimation(View view) {
        ImageView dummyFrame = (ImageView) findViewById(R.id.imageFrame);

        dummyFrame.setBackgroundResource(R.drawable.frame);

        AnimationDrawable frameAnimation = (AnimationDrawable) dummyFrame.getBackground();

        if (frameAnimation.isRunning()) {
            frameAnimation.stop();
        } else {
            frameAnimation.stop();
            frameAnimation.start();
        }


    }


}

