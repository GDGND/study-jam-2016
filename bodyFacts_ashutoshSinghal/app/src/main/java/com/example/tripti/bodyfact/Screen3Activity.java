package com.example.tripti.bodyfact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class Screen3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        final EditText edit1 = (EditText) findViewById(R.id.editText1);
        final EditText edit2 = (EditText) findViewById(R.id.editText2);
        Button submit = (Button)findViewById(R.id.submit_button);
        //screen 4 elements
        final ImageView bm1 = (ImageView) findViewById(R.id.bm1);
        final ImageView bm2 = (ImageView) findViewById(R.id.bm2);
        final ImageView bm3 = (ImageView) findViewById(R.id.bm3);
        final ImageView bm4 = (ImageView) findViewById(R.id.bm4);
        final TextView bmiview = (TextView) findViewById(R.id.bmi_text);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(edit1.getText()))
                {edit1.setError("compulsory");}

                else if( TextUtils.isEmpty(edit2.getText()))
                {edit2.setError("compulsory");}

                else {
                    float H = Float.valueOf(edit1.getText().toString());
                    float W = Float.valueOf(edit2.getText().toString());

                    float b = ((W * 10000) / H) / H;
                    String bmi = "Hello!!\n";

                    if (b >= 0.0 && b < 18.5) {
                        bm1.setVisibility(ImageView.VISIBLE);
                        bmi = bmi + " Your B.M.I is  " + b + "  Kg per meter^2\n" + "That suggests you are UNDERWEIGHT ";
                        bmiview.setText(bmi);
                    }
                    if (b >= 18.5 && b < 24.9) {
                        bm2.setVisibility(ImageView.VISIBLE);
                        bmi = bmi + " Your B.M.I is  " + b + "  Kg per meter^2\n" + "That suggests you are HEALTHY ";
                        bmiview.setText(bmi);
                    }
                    if (b >= 24.9 && b < 29.9) {
                        bm3.setVisibility(ImageView.VISIBLE);
                        bmi = bmi + " Your B.M.I is  " + b + "  Kg per meter^2\n" + "That suggests you are OVERWEIGHT ";
                        bmiview.setText(bmi);
                    }
                    if (b >= 29.9) {
                        bm4.setVisibility(ImageView.VISIBLE);
                        bmi = bmi + " Your B.M.I is  " + b + "  Kg per meter^2\n" + "That suggests you are OBESE ";
                        bmiview.setText(bmi);
                    }

                }

                bmiview.setVisibility(TextView.VISIBLE);

                Intent k = new Intent(getApplicationContext(),Screen4Activity.class);
                startActivity(k);
            }
        });
    }


}
