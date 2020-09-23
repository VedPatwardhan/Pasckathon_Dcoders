package com.abc.pasckathon_dcoders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity1 extends AppCompatActivity {
    Button loginButton;
    Button signUpButton;
    EditText userName;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);
        getSupportActionBar().setTitle("NOTIFICATIONS");
        loginButton=(Button)findViewById(R.id.loginButton);
        signUpButton=(Button)findViewById(R.id.signUpButton2);
        userName=(EditText)findViewById(R.id.userName);
        password=(EditText)findViewById(R.id.password);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName2 = userName.getText().toString().trim();
                String password2 = password.getText().toString().trim();
                if (userName2.isEmpty()) {
                    Toast.makeText(LoginActivity1.this, "Username cannot be left empty", Toast.LENGTH_LONG).show();
                } else if (password2.isEmpty()) {
                    Toast.makeText(LoginActivity1.this, "Password cannot be left empty", Toast.LENGTH_LONG).show();
                } else {
                    if (password2.equals(MainActivity.ob1.password)) {
                        Toast.makeText(LoginActivity1.this, "Successfully logged in", Toast.LENGTH_LONG).show();
                        Intent intentHomeLogin = new Intent(LoginActivity1.this, MainActivity.class);
                        startActivity(intentHomeLogin);
                        MainActivity.loggedIn = true;
                    } else {
                        Toast.makeText(LoginActivity1.this, "Incorrect password entered", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(MainActivity.ob1!=null)
                {
                    Toast.makeText(LoginActivity1.this,"You already have an account",Toast.LENGTH_LONG).show();
                }
                Intent intentLoginSignUp = new Intent(LoginActivity1.this, MedicalDetailsActivity.class);
                startActivity(intentLoginSignUp);
            }
        });
    }
}