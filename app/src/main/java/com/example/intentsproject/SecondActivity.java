package com.example.intentsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private String disp;
    private float calculation;
    private TextView calcText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Retrieve intent and extras
        Intent intent = getIntent();
        final String num1 = intent.getStringExtra("firstNum");
        final String num2 = intent.getStringExtra("secondNum");
        disp = "Choose an operation for "+num1+" and "+num2;
        calcText = findViewById(R.id.textView);
        calcText.setText(disp);

        findViewById(R.id.plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculation = Integer.parseInt(num1) + Integer.parseInt(num2);
                disp = num1 + " + " + num2 + " = " + calculation;
                calcText = findViewById(R.id.textView);
                calcText.setText(disp);
            }
        });

        findViewById(R.id.minus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculation = Integer.parseInt(num1) - Integer.parseInt(num2);
                disp = num1 + " - " + num2 + " = " + calculation;
                calcText = findViewById(R.id.textView);
                calcText.setText(disp);
            }
        });

        findViewById(R.id.divide).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculation = Integer.parseInt(num1) / (float)Integer.parseInt(num2);
                disp = num1 + " / " + num2 + " = " + calculation;
                calcText = findViewById(R.id.textView);
                calcText.setText(disp);
            }
        });

        findViewById(R.id.multip).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculation = Integer.parseInt(num1) * Integer.parseInt(num2);
                disp = num1 + " x " + num2 + " = " + calculation;
                calcText = findViewById(R.id.textView);
                calcText.setText(disp);
            }
        });
    }
}