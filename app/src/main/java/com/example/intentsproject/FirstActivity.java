package com.example.intentsproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        //First number input
        Fragment someFragment = getSupportFragmentManager().findFragmentByTag("numberinput1");
        View fragmentView = someFragment.getView();
        TextView t = (TextView) fragmentView.findViewById(R.id.numtag);
        final EditText input1 = (EditText) fragmentView.findViewById(R.id.editTextTextPersonName2);
        t.setText(R.string.num1tag);

        //Second number input
        someFragment = getSupportFragmentManager().findFragmentByTag("numberinput2");
        fragmentView = someFragment.getView();
        t = (TextView) fragmentView.findViewById(R.id.numtag);
        final EditText input2 = (EditText) fragmentView.findViewById(R.id.editTextTextPersonName2);
        t.setText(R.string.num2tag);

        findViewById(R.id.okbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent = new Intent(view.getContext(), SecondActivity.class);

                String num1 = input1.getText().toString();
                String num2 = input2.getText().toString();
                //Adding extras
                intent.putExtra("firstNum",num1);
                intent.putExtra("secondNum", num2);

                //Start activity 2
                startActivity(intent);

                //Creating a TOAST
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                CharSequence message = "Sending numbers ...";
                Toast aToast = Toast.makeText(context, message, duration);
                aToast.show();
            }
        });

    }
}