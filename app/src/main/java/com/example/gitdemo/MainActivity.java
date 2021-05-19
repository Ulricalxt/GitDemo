package com.example.gitdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int number = 0;
    private Button mButtonAdd ,mButtonSub;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonAdd = findViewById(R.id.buttonAdd);
        mButtonSub = findViewById(R.id.buttonSub);
        mTextView = findViewById(R.id.textview);
        mTextView.setText(String.valueOf(number));
        mButtonAdd.setOnClickListener(v -> mTextView.setText(String.valueOf(++number)));
        mButtonSub.setOnClickListener(v -> mTextView.setText(String.valueOf(--number)));

    }
}