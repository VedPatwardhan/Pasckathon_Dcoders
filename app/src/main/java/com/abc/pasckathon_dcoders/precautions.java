package com.abc.pasckathon_dcoders;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class precautions extends AppCompatActivity {
    private Button pneumonia1;
    private Button livercirrhosis1;
    private Button jaundice1;
    private Button diabetes1;
    private Button tetanus1;
    private Button typhoid1;
    private Button back1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_precautions);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        pneumonia1 = findViewById(R.id.pneumonia);
        pneumonia1.setOnClickListener(new View.OnClickListener() {
            class pneumonia {
            }

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(precautions.this , pneumonia.class);
                startActivity(intent);
            }
              });

        livercirrhosis1 = findViewById(R.id.livercirrhosis);
        livercirrhosis1.setOnClickListener(new View.OnClickListener() {
            class livercirrhosis {
            }

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(precautions.this , livercirrhosis.class);
                startActivity(intent);
            }
        });

        diabetes1 = findViewById(R.id.diabetes);
        diabetes1.setOnClickListener(new View.OnClickListener() {
            class diabetes {
            }

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(precautions.this , diabetes.class);
                startActivity(intent);
            }
        });

        typhoid1 = findViewById(R.id.typhoid);
        typhoid1.setOnClickListener(new View.OnClickListener() {
            class typhoid {
            }

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(precautions.this , typhoid.class);
                startActivity(intent);
            }
        });

        jaundice1 = findViewById(R.id.jaundice);
        jaundice1.setOnClickListener(new View.OnClickListener() {
            class jaundice {
            }

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(precautions.this , jaundice.class);
                startActivity(intent);
            }
        });

        tetanus1 = findViewById(R.id.tetanus);
        tetanus1.setOnClickListener(new View.OnClickListener() {
            class tetanus {
            }

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(precautions.this , tetanus.class);
                startActivity(intent);
            }
        });

        back1 = findViewById(R.id.back);
        back1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(precautions.this , MainActivity.class);
                startActivity(intent);
            }
        });
    }
}