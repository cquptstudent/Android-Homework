package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {
    private EditText mInputUsername;
    private EditText mInputPassword;
    private Button mButtonLogin;
    private Button mHaveAccount;
    private CheckBox mRememberPassword;
    private String passWord;
    private String username;
    private SharedPreferences.Editor editor;
    private long mExitTime = 0L;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        getInformation();
        SharedPreferences pref = getSharedPreferences("data", MODE_PRIVATE);
        Intent intent = getIntent();
        username = intent.getStringExtra("input_username");
        passWord = intent.getStringExtra("input_password");
        boolean isRememberPassword = pref.getBoolean("remember_password", false);
        if(isRememberPassword){
            username = pref.getString("username", "");
            passWord = pref.getString("password", "");
            mInputUsername.setText(username);
            mInputPassword.setText(passWord);
            mRememberPassword.setChecked(true);
        }
        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName;
                String password;
                userName = mInputUsername.getText().toString();
                password = mInputPassword.getText().toString();
                if (userName.equals(username) && password.equals(passWord)) {
                    editor = pref.edit();
                    if(mRememberPassword.isChecked()){
                        editor.putBoolean("remember_password", true);
                        editor.putString("username", username);
                        editor.putString("password", passWord);
                    }else{
                        editor.clear();
                    }editor.apply();
                    loginSuccess();
                } else if (userName.equals(username)) {
                    Toast.makeText(LogIn.this, "密码输入错误！", Toast.LENGTH_SHORT).show();
                } else if (password.equals(passWord)) {
                    Toast.makeText(LogIn.this, "未找到这个用户！", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(LogIn.this, "用户名，密码输入错误！", Toast.LENGTH_SHORT).show();
                }
            }
        });
        clickSignIn();
    }

    private void getInformation() {
        mInputUsername = findViewById(R.id.input_main_username);
        mInputPassword = findViewById(R.id.input_main_password);
        mButtonLogin = findViewById(R.id.button_main_login);
        mHaveAccount = findViewById(R.id.no_account);
        mRememberPassword  = findViewById(R.id.remember_password);
    }

    private void clickSignIn() {
        mHaveAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LogIn.this, SignIn.class);
                startActivity(intent);
            }

        });
    }
    private void loginSuccess() {
        Toast.makeText(this, "登录成功！", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, StoryOf3G.class);
        startActivity(intent);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (System.currentTimeMillis() - mExitTime > 2000) {
                Toast.makeText(this, "再按一次退出程序",
                        Toast.LENGTH_SHORT).show();
                mExitTime = System.currentTimeMillis();
                return false;
            }
        }
        return super.onKeyDown(keyCode, event);
    }
}