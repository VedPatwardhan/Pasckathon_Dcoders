package com.abc.pasckathon_dcoders;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Help1Activity extends AppCompatActivity {
    Button backHomeHelp1;
    Button backToHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help1);

        backHomeHelp1=(Button)findViewById(R.id.backHomeHelp1);
        backToHelp=(Button)findViewById(R.id.backToHelp);
        backHomeHelp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHomeProfile = new Intent(Help1Activity.this, MainActivity.class);
                startActivity(intentHomeProfile);
            }
        });
        backToHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHelpHelp1 = new Intent(Help1Activity.this, Help1Activity.class);
                startActivity(intentHelpHelp1);
            }
        });
    }
}
