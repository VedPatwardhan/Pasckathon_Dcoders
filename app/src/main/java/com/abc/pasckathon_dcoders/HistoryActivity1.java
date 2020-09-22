package com.abc.pasckathon_dcoders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HistoryActivity1 extends AppCompatActivity {
    Button backHomeHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history1);
        getSupportActionBar().setTitle("HISTORY");
        backHomeHistory=(Button)findViewById(R.id.backHomeHistory);
        backHomeHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHomeHistory = new Intent(HistoryActivity1.this, MainActivity.class);
                startActivity(intentHomeHistory);
            }
        });
    }
}
