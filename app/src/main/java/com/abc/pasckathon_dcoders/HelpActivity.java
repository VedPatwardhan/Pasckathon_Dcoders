package com.abc.pasckathon_dcoders;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HelpActivity extends AppCompatActivity {
    Button backHomeHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);

        backHomeHelp=(Button)findViewById(R.id.backHomeHelp);
        backHomeHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHomeHelp = new Intent(HelpActivity.this, MainActivity.class);
                startActivity(intentHomeHelp);
            }
        });
    }
}
