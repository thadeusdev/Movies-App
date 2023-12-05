package com.example.moviesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText userEdit,passEdit;
    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        initView();
    }

    private void initView() {
        userEdit=findViewById(R.id.editTextText);
        passEdit=findViewById(R.id.editTextPassword);
        loginBtn=findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (userEdit.getText().toString().isEmpty() || passEdit.getText().toString().isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Please Enter your username and password", Toast.LENGTH_SHORT).show();
                } else if (userEdit.getText().toString().equals("test") && passEdit.getText().toString().equals("test")) {
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                } else {
                    Toast.makeText(LoginActivity.this,"Your username and password is incorrect",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}