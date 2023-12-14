package com.example.myapplication4stableversion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private RecyclerView recyclerView;

    private Button mButton;
    private Button mButtonPrevious;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView = findViewById(R.id.recyclerview);
        ArrayList<Message> data = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Message message = new Message();
            message.setNumber(i + 1);
            message.setMessage(" Message " + (i + 1));
            data.add(message);
        }
        Adapter adapter = new Adapter(data);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mButton=findViewById(R.id.btnNext2);
        mButtonPrevious=findViewById(R.id.btnPrevious);
        click();
        click2();
    }

    public void click(){
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();
            }
        });
    }
    public void next(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    public void click2(){
        mButtonPrevious.setOnClickListener(v -> previous());
    }

    public void previous(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}

