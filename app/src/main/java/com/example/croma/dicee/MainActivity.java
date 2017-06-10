package com.example.croma.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static android.R.attr.right;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollbutton;
        rollbutton=(Button) findViewById(R.id.rollButton);
       final ImageView leftdice;
       final int [] diceArray = {R.drawable.dice1,R.drawable.dice2,
                            R.drawable.dice3,R.drawable.dice4,
                            R.drawable.dice5,R.drawable.dice6};
        leftdice = (ImageView) findViewById(R.id.image_leftDice);
       final ImageView rightdice;
        rightdice = (ImageView) findViewById(R.id.image_rightDice);

        rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Log.d("Dicee"," Button is pressed ");
                Random RandomNumberGenerator = new Random();
                int number = RandomNumberGenerator.nextInt(6);
                leftdice.setImageResource(diceArray[number]);
                int no = RandomNumberGenerator.nextInt(6);
                rightdice.setImageResource(diceArray[no]);
            }

        });



    }
}
