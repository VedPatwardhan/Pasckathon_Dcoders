package com.abc.pasckathon_dcoders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

public class SignUpActivity extends AppCompatActivity {
    Button nextSelect;
    EditText userName;
    EditText password;
    EditText passwordConfirmation;
    DatabaseReference databasePatients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        databasePatients= FirebaseDatabase.getInstance().getReference("Patients");
        setContentView(R.layout.activity_sign_up);
        nextSelect=(Button)findViewById(R.id.signUpButton1);
        userName=(EditText)findViewById(R.id.userName);
        password=(EditText)findViewById(R.id.password);
        passwordConfirmation=(EditText)findViewById(R.id.passwordConfirmation);
        nextSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName1=userName.getText().toString().trim();
                String password1=password.getText().toString().trim();
                String passwordConfirmation1=passwordConfirmation.getText().toString().trim();
                if(!password1.equals(passwordConfirmation1))
                {
                    Toast.makeText(SignUpActivity.this,"Password does not match to re-entered password",Toast.LENGTH_LONG).show();
                }
                else
                {
                    if (userName1.isEmpty()) {
                        Toast.makeText(SignUpActivity.this, "Username cannot be empty", Toast.LENGTH_LONG).show();
                    } else if (password1.isEmpty()) {
                        Toast.makeText(SignUpActivity.this, "Password cannot be empty", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        addUsernamePassword(userName1,password1);
                        Intent intentNextPage = new Intent(SignUpActivity.this, SignUpActivity2.class);
                        startActivity(intentNextPage);
                    }
                }

            }
        });
    }

    private void addUsernamePassword(String userName1,String password1)
    {
        MainActivity.id=databasePatients.push().getKey();
        PatientData ob=new PatientData(userName1,password1);
        MainActivity.ob1=ob;
        Toast.makeText(SignUpActivity.this, "Username saved, please enter further details", Toast.LENGTH_LONG).show();
    }
}