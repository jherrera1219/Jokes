package com.example.jokesapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_joke1, btn_joke2, btn_joke3, btn_joke4, btn_joke5, btn_joke6;

    TextView tv_message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_joke1 = findViewById(R.id.btn_joke1);
        btn_joke2 = findViewById(R.id.btn_joke2);
        btn_joke3 = findViewById(R.id.btn_joke3);
        btn_joke4 = findViewById(R.id.btn_joke4);
        btn_joke5 = findViewById(R.id.btn_joke5);
        btn_joke6 = findViewById(R.id.btn_joke6);

        tv_message = findViewById(R.id.tv_message);

        // create click listeners
        btn_joke1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_message.setText("A pork chop.");
            }
        });

        btn_joke2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_message.setText("Aw Shucks!");
            }
        });

        btn_joke3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_message.setText("He'll stop at nothing to avoid them.");
            }
        });

        // Jokes 4 5 and 6 will use the textview to display the answer
        btn_joke4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  tv_message.setText("Once. The next time you will be subtracting 10 from 90.");
            }
        });

        btn_joke5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_message.setText("He just needed a little space.");
            }
        });

        btn_joke6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_message.setText("A receding hare-line.");
            }
        });
    }
}