package com.abc.pasckathon_dcoders;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    Button backHomeProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        backHomeProfile=(Button)findViewById(R.id.backHomeProfile);
        backHomeProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHomeProfile = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(intentHomeProfile);
            }
        });
    }
}
