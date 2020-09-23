package com.abc.pasckathon_dcoders;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MedicalDetailsActivity extends AppCompatActivity {
    Spinner disease;
    SeekBar severity;
    Button diseaseSubmit;
    String disease1;
    int severity1;
    DatabaseReference databasePatients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(MedicalDetailsActivity.this, "Just a few more details about you",Toast.LENGTH_LONG).show();
        databasePatients= FirebaseDatabase.getInstance().getReference("Patients");
        setContentView(R.layout.activity_medical_details);
        disease=(Spinner)findViewById(R.id.spinnerDisease);
        severity=(SeekBar)findViewById(R.id.seekBarDisease);
        diseaseSubmit=(Button)findViewById(R.id.buttonDisease);
        disease1=disease.getSelectedItem().toString().trim();
        severity1=severity.getProgress();
        diseaseSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(severity1==0)
                {
                    Toast.makeText(MedicalDetailsActivity.this, "Severity cannot be 0",Toast.LENGTH_LONG).show();
                }
                else {
                    MainActivity.ob1.setDiseaseStuff(disease1, severity1);
                    databasePatients.child(MainActivity.id).setValue(MainActivity.ob1);
                    Toast.makeText(MedicalDetailsActivity.this, "Your data has been saved and medicines have been prescribed",Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}