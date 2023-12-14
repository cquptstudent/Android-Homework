package com.example.myapplication4stableversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        pressButton();
    }

    public void initView(){
        mButton = findViewById(R.id.btnStart);
    }

    public void pressButton(){
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();
            }
        });
    }

    public void next(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}