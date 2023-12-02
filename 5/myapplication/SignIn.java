package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {
    private EditText mgetUsername;
    private EditText mgetPassword;
    private Button mClickButton;
    private Button mAlreadyHave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        getInformation();
        clickButton();
        clickAlreadyHave();
    }

    private void getInformation(){
        mgetUsername = findViewById(R.id.input_main_username);
        mgetPassword = findViewById(R.id.input_main_password);
        mClickButton = findViewById(R.id.button_main_login);
        mAlreadyHave = findViewById(R.id.have_account);
    }

    private void clickAlreadyHave(){
        mAlreadyHave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }

    private void login(){
        Intent intent = new Intent(SignIn.this, LogIn.class);
        startActivity(intent);
    }
    private void clickButton(){
        mClickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signIn();
            }
        });
    }

    private void signIn(){
        String username = mgetUsername.getText().toString();
        String password = mgetPassword.getText().toString();
        Toast.makeText(this,"注册成功！", Toast.LENGTH_SHORT).show();
        SharedPreferences.Editor editor = getSharedPreferences("data", MODE_PRIVATE).edit();
        editor.putString("username", username);
        editor.putString("password", password);
        editor.apply();
        Intent intent = new Intent(SignIn.this, LogIn.class);
        intent.putExtra("input_username", username);
        intent.putExtra("input_password", password);
        startActivity(intent);
    }
}