package com.project.hellotoastchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button toastButton;
    public Button countButton;
    public TextView textView;
    private int mCount=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toastButton = (Button) findViewById(R.id.toastButtonID);
        countButton = (Button) findViewById(R.id.countButtonID);
        textView = (TextView) findViewById(R.id.textViewID);



        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Here, have some Toast ;-)", Toast.LENGTH_LONG).show();
            }
        });

    }


    public void countUp(View view) {
        mCount++;
        if(textView !=null)
            textView.setText(Integer.toString(mCount));
    }
}

