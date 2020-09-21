package com.abc.pasckathon_dcoders;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HistoryActivity extends AppCompatActivity {
    Button backHomeHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history);
        getSupportActionBar().setTitle("HISTORY");
        backHomeHistory=(Button)findViewById(R.id.backHomeHistory);
        backHomeHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHomeHistory = new Intent(HistoryActivity.this, MainActivity.class);
                startActivity(intentHomeHistory);
            }
        });
    }
}
