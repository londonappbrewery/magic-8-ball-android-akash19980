package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button press = (Button) findViewById(R.id.Press);
        final ImageView Output = (ImageView) findViewById(R.id.ball);

        final int[] outputimages = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3, R.drawable.ball4, R.drawable.ball5};
        press.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random number=new Random();
                int n=number.nextInt(4);
                Output.setImageResource(outputimages[n]);

            }
        });

    }
}
