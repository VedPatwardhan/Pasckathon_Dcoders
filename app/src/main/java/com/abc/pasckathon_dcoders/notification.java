package com.abc.pasckathon_dcoders;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

class NotificationActivity extends AppCompatActivity {
    Button backHomeNotification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification);
        getSupportActionBar().setTitle("NOTIFICATIONS");
        backHomeNotification=(Button)findViewById(R.id.backHomeTracker);
        backHomeNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHomeSetting = new Intent(NotificationActivity.this, MainActivity.class);
                startActivity(intentHomeSetting);
            }
        });
    }
}