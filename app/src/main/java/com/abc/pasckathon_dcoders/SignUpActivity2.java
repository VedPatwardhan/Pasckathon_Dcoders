package com.abc.pasckathon_dcoders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignUpActivity2 extends AppCompatActivity {
    ScrollView scroll;
    Button confirm;
    EditText name;
    EditText emailAddress;
    EditText address;
    Spinner region;
    EditText aadharNumber;
    EditText phoneNumber;
    CheckBox checkAgree;
    DatabaseReference databasePatients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        databasePatients= FirebaseDatabase.getInstance().getReference("Patients");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up2);
        scroll=(ScrollView)findViewById(R.id.scrollView);
        name=(EditText)findViewById(R.id.name);
        emailAddress=(EditText)findViewById(R.id.emailAddress);
        address=(EditText)findViewById(R.id.address);
        region=(Spinner)findViewById(R.id.spinRegion);
        aadharNumber=(EditText)findViewById(R.id.aadharNumber);
        phoneNumber=(EditText)findViewById(R.id.phoneNumber);
        checkAgree=(CheckBox)findViewById(R.id.checkAgree);
        confirm=(Button)findViewById(R.id.confirm);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(checkAgree.isChecked()) {
                    String name1=name.getText().toString().trim();
                    String email1=emailAddress.getText().toString().trim();
                    String address1=address.getText().toString().trim();
                    String region1=region.getSelectedItem().toString().trim();
                    String aadhar1=aadharNumber.getText().toString().trim();
                    String phone1=phoneNumber.getText().toString().trim();
                    confirm=(Button)findViewById(R.id.confirm);
                    if(name1.isEmpty())
                    {
                        Toast.makeText(SignUpActivity2.this,"Name cannot be left empty",Toast.LENGTH_LONG).show();
                    }
                    else if(email1.isEmpty())
                    {
                        Toast.makeText(SignUpActivity2.this,"Email cannot be left empty",Toast.LENGTH_LONG).show();
                    }
                    else if(address1.isEmpty())
                    {
                        Toast.makeText(SignUpActivity2.this,"Address cannot be left empty",Toast.LENGTH_LONG).show();
                    }
                    else if(region1.isEmpty())
                    {
                        Toast.makeText(SignUpActivity2.this,"Please select your region",Toast.LENGTH_LONG).show();
                    }
                    else if(aadhar1.isEmpty())
                    {
                        Toast.makeText(SignUpActivity2.this,"Aadhar number cannot be left empty",Toast.LENGTH_LONG).show();
                    }
                    else if(phone1.isEmpty())
                    {
                        Toast.makeText(SignUpActivity2.this,"Phone number cannot be left empty",Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        MainActivity.ob1.setAadhar_card_no(Long.parseLong(aadhar1));
                        MainActivity.ob1.setPhone_number(Long.parseLong(phone1));
                        MainActivity.ob1.setAddress(address1);
                        MainActivity.ob1.setEmail_id(email1);
                        MainActivity.ob1.setRegion(region1);
                        MainActivity.ob1.setName(name1);
                        addPatientData(MainActivity.ob1);
                        Intent intentHomeLogin = new Intent(SignUpActivity2.this, LoginActivity1.class);
                        startActivity(intentHomeLogin);
                    }
                }
                else
                {
                    Toast.makeText(SignUpActivity2.this, "Please check the checkbox",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    void addPatientData(PatientData ob1)
    {
        databasePatients.child(MainActivity.id).setValue(ob1);
    }
}