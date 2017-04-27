package com.example.tripti.bodyfact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Screen4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);
        Button reset = (Button)findViewById(R.id.reset_button);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView bm1 = (ImageView)findViewById(R.id.bm1);
                ImageView bm2 = (ImageView)findViewById(R.id.bm2);
                ImageView bm3 = (ImageView)findViewById(R.id.bm3);
                ImageView bm4 = (ImageView)findViewById(R.id.bm1);
                bm1.setVisibility(ImageView.GONE);
                bm2.setVisibility(ImageView.GONE);
                bm3.setVisibility(ImageView.GONE);
                bm4.setVisibility(ImageView.GONE);

                EditText edit1 = (EditText)findViewById(R.id.editText1);
                EditText edit2 = (EditText)findViewById(R.id.editText2);
                edit1.setText("Height");
                edit2.setText("Weight");

                Intent l = new Intent(getApplicationContext(),Screen3Activity.class);
                startActivity(l);



            }
        });
    }



}
