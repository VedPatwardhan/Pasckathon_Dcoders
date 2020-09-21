package com.abc.pasckathon_dcoders;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ContactActivity extends AppCompatActivity {
    Button backHomeContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);

        backHomeContact=(Button)findViewById(R.id.backHomeContact);
        backHomeContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHomeContact = new Intent(ContactActivity.this, MainActivity.class);
                startActivity(intentHomeContact);
            }
        });
    }
}
