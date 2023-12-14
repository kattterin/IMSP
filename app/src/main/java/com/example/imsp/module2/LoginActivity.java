package com.example.imsp.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.imsp.R;


public class LoginActivity extends AppCompatActivity {
    EditText loginET;
    EditText pwdET;
    Button loginBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginET = this.findViewById(R.id.logitET);
        pwdET = this.findViewById(R.id.pwdET);
        loginBtn = this.findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String login = loginET.getText().toString();
                String pwd = pwdET.getText().toString();
                if (login.equals("hello") && pwd.equals("world")) {
                    Toast.makeText(LoginActivity.this, "you", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getBaseContext(), NewsActivity.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(LoginActivity.this, "none", Toast.LENGTH_SHORT).show();
                }


            }
        });
//        System.out.println(loginET.getText()); пустая строка
//        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();

    }

}