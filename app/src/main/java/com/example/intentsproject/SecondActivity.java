package com.example.intentsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Retrieve intent and extras
        Intent intent = getIntent();
        String num1 = intent.getStringExtra("firstNum");
        String num2 = intent.getStringExtra("secondNum");

        TextView txtView = findViewById(R.id.textView);
        txtView.setText(num1);
        txtView = findViewById(R.id.textView2);
        txtView.setText(num2);
    }
}