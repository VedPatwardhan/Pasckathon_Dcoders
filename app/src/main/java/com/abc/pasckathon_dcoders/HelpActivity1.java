package com.abc.pasckathon_dcoders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelpActivity1 extends AppCompatActivity {
    Button backHomeHelp;
    Button toHelp1;
    Button toHelp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help1);
        getSupportActionBar().setTitle("HELP");
        toHelp1=(Button)findViewById(R.id.help1);
        toHelp2=(Button)findViewById(R.id.help2);
        backHomeHelp=(Button)findViewById(R.id.backHomeHelp);
        backHomeHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHomeHelp = new Intent(HelpActivity1.this, MainActivity.class);
                startActivity(intentHomeHelp);
            }
        });
        toHelp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHelpHelp2 = new Intent(HelpActivity1.this, Help2Activity1.class);
                startActivity(intentHelpHelp2);
            }
        });
        toHelp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHelpHelp1 = new Intent(HelpActivity1.this, Help1Activity1.class);
                startActivity(intentHelpHelp1);
            }
        });
    }
}
