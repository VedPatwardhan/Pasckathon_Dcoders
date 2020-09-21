package com.abc.pasckathon_dcoders;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Help2Activity extends AppCompatActivity {
    Button backHomeHelp2;
    Button backToHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help2);

        backHomeHelp2=(Button)findViewById(R.id.backHomeHelp2);
        backToHelp=(Button)findViewById(R.id.backToHelp);
        backHomeHelp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHomeProfile = new Intent(Help2Activity.this, MainActivity.class);
                startActivity(intentHomeProfile);
            }
        });
        backToHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHelpHelp2 = new Intent(Help2Activity.this, Help1Activity.class);
                startActivity(intentHelpHelp2);
            }
        });
    }
}
