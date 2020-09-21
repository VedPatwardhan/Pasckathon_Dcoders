package com.abc.pasckathon_dcoders;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CalendarActivity extends AppCompatActivity {
    Button backHomeCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);

        backHomeCalendar=(Button)findViewById(R.id.backHomeCalendar);
        backHomeCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHomeCalendar = new Intent(CalendarActivity.this, MainActivity.class);
                startActivity(intentHomeCalendar);
            }
        });
    }
}
