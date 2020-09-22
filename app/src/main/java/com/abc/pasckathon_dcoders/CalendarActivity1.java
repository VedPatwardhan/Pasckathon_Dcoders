package com.abc.pasckathon_dcoders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalendarActivity1 extends AppCompatActivity {
    Button backHomeCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar1);
        getSupportActionBar().setTitle("CALENDER");
        backHomeCalendar=(Button)findViewById(R.id.backHomeCalendar);
        backHomeCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHomeCalendar = new Intent(CalendarActivity1.this, MainActivity.class);
                startActivity(intentHomeCalendar);
            }
        });
    }
}
