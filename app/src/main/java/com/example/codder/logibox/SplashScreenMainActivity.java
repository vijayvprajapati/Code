package com.example.codder.logibox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreenMainActivity extends AppCompatActivity {

     ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_main);

        img=(ImageView)findViewById(R.id.imagesplash);


    }


    @Override
    protected void onResume() {
        super.onResume();
        final Thread thread=new Thread(new Runnable() {
            @Override
            public void run()
            {
                try
                {
                    Animation anim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scalesplash);
                    img.startAnimation(anim);

                    Thread.sleep(2000);
                    Intent i=new Intent(getApplicationContext(),LoginMainActivity.class);
                    startActivity(i);
                }catch (Exception e)
                {
                    e.printStackTrace();
                }

            }

        });
        thread.start();

    }
}
