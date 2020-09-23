package com.abc.pasckathon_dcoders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProfileActivity1 extends AppCompatActivity {
    Button backHomeProfile;
    EditText name1;
    EditText address1;
    EditText emailid1;
    EditText aadharNumber1;
    EditText phoneNumber1;
    Button editProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile1);
        getSupportActionBar().setTitle("PROFILE");
        backHomeProfile=(Button)findViewById(R.id.backHomeProfile);
        editProfile=(Button)findViewById(R.id.button);
        name1=(EditText)findViewById(R.id.NameProfile);
        address1=(EditText)findViewById(R.id.editTextTextMultiLine3);
        emailid1=(EditText)findViewById(R.id.editTextTextEmailAddress);
        aadharNumber1=(EditText)findViewById(R.id.editTextTextPersonName5);
        phoneNumber1=(EditText)findViewById(R.id.editTextPhone5);
        name1.setText(MainActivity.ob1.name);
        address1.setText(MainActivity.ob1.address);
        emailid1.setText(MainActivity.ob1.email_id);
        aadharNumber1.setText(String.valueOf(MainActivity.ob1.aadhar_card_no));
        phoneNumber1.setText(String.valueOf(MainActivity.ob1.phone_number));

        backHomeProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHomeProfile = new Intent(ProfileActivity1.this, MainActivity.class);
                startActivity(intentHomeProfile);
            }
        });

        editProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.ob1.setName(name1.getText().toString().trim());
                MainActivity.ob1.setAddress(address1.getText().toString().trim());
                MainActivity.ob1.setEmail_id(emailid1.getText().toString().trim());
                MainActivity.ob1.setAadhar_card_no(Long.parseLong(aadharNumber1.getText().toString().trim()));
                MainActivity.ob1.setPhone_number(Long.parseLong(phoneNumber1.getText().toString().trim()));
                Toast.makeText(ProfileActivity1.this,"Profile updated",Toast.LENGTH_LONG).show();
            }
        });
    }
}
