package com.example.tripti.bodyfact;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //delay fuction here
        new CountDownTimer(6000, 1000) {
            public void onFinish() {
                final ImageView Image1 = (ImageView) findViewById(R.id.beg);
                final TextView introText = (TextView) findViewById(R.id.introtext);
                final TextView  introText2 = (TextView) findViewById(R.id.introtext2);


                Image1.setVisibility(ImageView.GONE);
                introText.setVisibility(TextView.GONE);
                introText2.setVisibility(TextView.GONE);
            }

            public void onTick(long millisUntilFinished) {//the amount of time until finished}

            }
        }.start();

            Intent i = new Intent(getApplicationContext(),Screen2Activity.class);
            startActivity(i);
    }

}
