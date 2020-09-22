package com.abc.pasckathon_dcoders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileActivity1 extends AppCompatActivity {
    Button backHomeProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile1);
        getSupportActionBar().setTitle("PROFILE");
        backHomeProfile=(Button)findViewById(R.id.backHomeProfile);
        backHomeProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHomeProfile = new Intent(ProfileActivity1.this, MainActivity.class);
                startActivity(intentHomeProfile);
            }
        });
    }
}
