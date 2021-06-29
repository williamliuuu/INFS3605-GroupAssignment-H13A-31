package com.example.infs3605_h13a31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText loginEmail, loginPassword;
    private Button loginSignin;
    private TextView loginForgotPassword, loginRegister;
    private ProgressBar loginProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginEmail = findViewById(R.id.loginEmail);
        loginPassword = findViewById(R.id.loginPassword);
        loginSignin = findViewById(R.id.loginSignin);
        loginSignin.setOnClickListener(this);
        loginRegister = findViewById(R.id.loginRegister);
        loginRegister.setOnClickListener(this);
        loginForgotPassword = findViewById(R.id.loginForgotPassword);
        loginForgotPassword.setOnClickListener(this);
        loginProgressBar = findViewById(R.id.loginProgressBar);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.loginRegister:
                startActivity(new Intent(this, RegisterActivity.class));
                break;
        }
    }
}