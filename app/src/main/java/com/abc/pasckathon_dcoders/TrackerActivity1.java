package com.abc.pasckathon_dcoders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TrackerActivity1 extends AppCompatActivity {
    Button backHomeTracker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracker1);
        getSupportActionBar().setTitle("TRACKER");
        backHomeTracker=(Button)findViewById(R.id.backHomeTracker);
        backHomeTracker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHomeTracker = new Intent(TrackerActivity1.this, MainActivity.class);
                startActivity(intentHomeTracker);
            }
        });
    }
}
