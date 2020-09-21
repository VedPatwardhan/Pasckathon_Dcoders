package com.abc.pasckathon_dcoders;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SettingActivity extends AppCompatActivity {
    Button backHomeSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        getSupportActionBar().setTitle("SETTING");
        backHomeSetting=(Button)findViewById(R.id.backHomeSetting);
        backHomeSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHomeSetting = new Intent(SettingActivity.this, MainActivity.class);
                startActivity(intentHomeSetting);
            }
        });
    }
}
