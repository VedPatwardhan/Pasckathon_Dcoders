package com.abc.pasckathon_dcoders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactActivity1 extends AppCompatActivity {
    Button backHomeContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact1);
        getSupportActionBar().setTitle("CONTACT");
        backHomeContact=(Button)findViewById(R.id.backHomeContact);
        backHomeContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHomeContact = new Intent(ContactActivity1.this, MainActivity.class);
                startActivity(intentHomeContact);
            }
        });
    }
}
