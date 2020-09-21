package com.abc.pasckathon_dcoders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button profileButton;
    Button calendarButton;
    Button contactButton;
    Button helpButton;
    Button historyButton;
    Button settingButton;
    Button trackerButton;
    Button notificationButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        profileButton=(Button)findViewById(R.id.profile);
        calendarButton=(Button)findViewById(R.id.calender);
        contactButton=(Button)findViewById(R.id.contact);
        helpButton=(Button)findViewById(R.id.help);
        historyButton=(Button)findViewById(R.id.history);
        settingButton=(Button)findViewById(R.id.setting);
        trackerButton = (Button) findViewById(R.id.tracker);
        notificationButton=(Button)findViewById(R.id.notification);
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_profile=new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent_profile);
            }
        });
        calendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_calendar=new Intent(MainActivity.this, CalendarActivity.class);
                startActivity(intent_calendar);
            }
        });
        contactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_contact=new Intent(MainActivity.this, ContactActivity.class);
                startActivity(intent_contact);
            }
        });
        helpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_help=new Intent(MainActivity.this, HelpActivity.class);
                startActivity(intent_help);
            }
        });
        historyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_history=new Intent(MainActivity.this, HistoryActivity.class);
                startActivity(intent_history);
            }
        });
        settingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_setting=new Intent(MainActivity.this, SettingActivity.class);
                startActivity(intent_setting);
            }
        });
        trackerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_setting=new Intent(MainActivity.this, SettingActivity.class);
                startActivity(intent_setting);
            }
        });
        notificationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_setting=new Intent(MainActivity.this, SettingActivity.class);
                startActivity(intent_setting);
            }
        });
    }
}