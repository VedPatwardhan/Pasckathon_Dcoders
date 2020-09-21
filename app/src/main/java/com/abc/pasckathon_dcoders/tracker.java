package com.abc.pasckathon_dcoders;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

class TrackerActivity extends AppCompatActivity {
    Button backHomeTracker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        getSupportActionBar().setTitle("TRACKER");
        backHomeTracker=(Button)findViewById(R.id.backHomeTracker);
        backHomeTracker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHomeSetting = new Intent(TrackerActivity.this, MainActivity.class);
                startActivity(intentHomeSetting);
            }
        });
    }
}
