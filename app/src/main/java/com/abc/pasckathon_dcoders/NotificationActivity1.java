package com.abc.pasckathon_dcoders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NotificationActivity1 extends AppCompatActivity {
    Button backHomeNotification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification1);
        getSupportActionBar().setTitle("NOTIFICATIONS");
        backHomeNotification=(Button)findViewById(R.id.backHomeNotification);
        backHomeNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHomeSetting = new Intent(NotificationActivity1.this, MainActivity.class);
                startActivity(intentHomeSetting);
            }
        });
    }
}