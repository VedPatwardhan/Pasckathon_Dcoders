package com.abc.pasckathon_dcoders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingActivity1 extends AppCompatActivity {
    Button backHomeSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting1);
        getSupportActionBar().setTitle("SETTING");
        backHomeSetting=(Button)findViewById(R.id.backHomeSetting);
        backHomeSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHomeSetting = new Intent(SettingActivity1.this, MainActivity.class);
                startActivity(intentHomeSetting);
            }
        });
    }
}
