package com.abc.pasckathon_dcoders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public static String shop_id;
    public static String id;
    public static PatientData ob1;
    static boolean loggedIn=false;
    static HashMap<String, ArrayList<String>> diseaseMedicine=new HashMap<>();
    static ArrayList<String> diabetes=new ArrayList<>();
    static ArrayList<String> asthma=new ArrayList<>();
    static ArrayList<String> kidneyRelated=new ArrayList<>();
    static ArrayList<String> BP=new ArrayList<>();
    static ArrayList<String> diseases=new ArrayList<>();
    static ArrayList<String> allMedicines=new ArrayList<>();
    static ArrayList<Integer> allQuantities=new ArrayList<>();
    Button profileButton;
    Button calendarButton;
    Button contactButton;
    Button helpButton;
    Button historyButton;
    Button settingButton;
    Button trackerButton;
    Button notificationButton;

    DatabaseReference databaseShops;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        diseases.add("Diabetes");
        diseases.add("Asthma");
        diseases.add("Kidney-related");
        diseases.add("High Blood Pressure");

        diabetes.add("Metformin");
        diabetes.add("Sulfonylurease");
        diabetes.add("Meglitinides");

        asthma.add("Inhaled corticosteroids");
        asthma.add("Leukotriene modifiers");
        asthma.add("Theophylline");

        kidneyRelated.add("Erythropoietin");
        kidneyRelated.add("Iron supplements");
        kidneyRelated.add("Phosphate binders");

        BP.add("Amlodipine");
        BP.add("Diltiazem");
        BP.add("Felodipin");

        diseaseMedicine.put("Diabetes",diabetes);
        diseaseMedicine.put("Asthma",asthma);
        diseaseMedicine.put("Kidney-Related",kidneyRelated);
        diseaseMedicine.put("High Blood Pressure",BP);

        allMedicines.addAll(diabetes);
        allMedicines.addAll(asthma);
        allMedicines.addAll(kidneyRelated);
        allMedicines.addAll(BP);
// To create the database
//        databaseShops= FirebaseDatabase.getInstance().getReference("Shops");
//        shop_id=databaseShops.push().getKey();
//        Random random=new Random();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob1=new MedicalShops("Marvel Chemist Superstore","Koregaon Park",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob1);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob2=new MedicalShops("Ramesh Medical Store","Koregaon Park",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob2);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob3=new MedicalShops("Amar Medical","Tilak Road",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob3);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob4=new MedicalShops("Ganesh Medicals","Tilak Road",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob4);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob5=new MedicalShops("Kiran Medical Service","Laxmi Road",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob5);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob6=new MedicalShops("National medical and general store","Laxmi Road",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob6);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob7=new MedicalShops("Swastik Medical Store","Sarasbaug",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob7);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob8=new MedicalShops("Abhay Medical","Sarasbaug",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob8);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob9=new MedicalShops("Medico Point","Warje",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob9);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob10=new MedicalShops("Ashwini Medical","Warje",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob10);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob11=new MedicalShops("Swami Medical Store","Kothrud",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob11);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob12=new MedicalShops("Anish Medical Store","Kothrud",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob12);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob13=new MedicalShops("Shivam Medicals","Katraj",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob13);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob14=new MedicalShops("Bharti Medicals","Katraj",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob14);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob15=new MedicalShops("Twarika Medical","Swargate",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob15);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob16=new MedicalShops("Nakoda Medical Store","Swargate",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob16);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob17=new MedicalShops("Ambika Medicals","Shivaji Nagar",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob17);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob18=new MedicalShops("Mohini Medical Store","Shivaji Nagar",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob18);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob19=new MedicalShops("Anup Medical Store","Hadapsar",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob19);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob20=new MedicalShops("Pooja Medical Store","Hadapsar",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob20);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob21=new MedicalShops("Ahuja Medical","Viman Nagar",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob21);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob22=new MedicalShops("Leelai Medical","Viman Nagar",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob22);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob23=new MedicalShops("Jyoti Medical Store","Market Yard",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob23);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob24=new MedicalShops("Navkar Medical Store","Market Yard",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob24);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob25=new MedicalShops("K M Medical Store","Somwar Peth",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob25);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob26=new MedicalShops("K M Medical Store","Somwar Peth",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob26);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob27=new MedicalShops("Yogesh Medicale","Budhwar Peth",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob27);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob28=new MedicalShops("Sameer Medical Store","Budhwar Peth",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob28);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob29=new MedicalShops("Raka Medical and General Store","Guruwar Peth",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob29);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob30=new MedicalShops("Manish Medical and General Store","Guruwar Peth",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob30);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob31=new MedicalShops("Mahavir Medical and General Store","Shukrawar Peth",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob31);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob32=new MedicalShops("Shree Medical Store","Shukrawar Peth",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob32);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob33=new MedicalShops("Parth Medical and General Store","Shaniwar Peth",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob33);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob34=new MedicalShops("Beamon Medical and General Store","Shaniwar Peth",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob34);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob35=new MedicalShops("Gurukrupa Medical Store","Raviwar Peth",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob35);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob36=new MedicalShops("Relief Drug House Medical Store","Raviwar Peth",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob36);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob37=new MedicalShops("Satyam Medical and General Store","Appar",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob37);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob38=new MedicalShops("Samarth Medicals","Appar",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob38);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob39=new MedicalShops("Vandana Medical and General Store","Kondhwa",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob39);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob40=new MedicalShops("Muktai Medical and General Store","Kondhwa",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob40);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob41=new MedicalShops("Royal Medical and General Store","NIBM Road",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob41);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob42=new MedicalShops("Delux Medical Stores","NIBM Road",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob42);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob43=new MedicalShops("Balaji Medical","Undhri",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob43);
//
//        shop_id=databaseShops.push().getKey();
//
//        allQuantities.clear();
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            int j=random.nextInt(12);
//            allQuantities.add(j*15+120);
//        }
//        MedicalShops ob44=new MedicalShops("Sanchit Medical","Undhri",allMedicines,allQuantities);
//        databaseShops.child(MainActivity.shop_id).setValue(ob44);
//

        if(!loggedIn) {
            Intent intent_login = new Intent(MainActivity.this, LoginActivity1.class);
            startActivity(intent_login);
        }
        setContentView(R.layout.activity_main);
        profileButton=(Button)findViewById(R.id.profile);
        calendarButton=(Button)findViewById(R.id.calendar);
        contactButton=(Button)findViewById(R.id.contact);
        helpButton=(Button)findViewById(R.id.help);
        historyButton=(Button)findViewById(R.id.history);
        settingButton=(Button)findViewById(R.id.setting);
        trackerButton = (Button) findViewById(R.id.trackers);
        notificationButton=(Button)findViewById(R.id.notification);
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_profile=new Intent(MainActivity.this, ProfileActivity1.class);
                startActivity(intent_profile);
            }
        });
        calendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_calendar=new Intent(MainActivity.this, CalendarActivity1.class);
                startActivity(intent_calendar);
            }
        });
        contactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_contact=new Intent(MainActivity.this, ContactActivity1.class);
                startActivity(intent_contact);
            }
        });
        helpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_help=new Intent(MainActivity.this, HelpActivity1.class);
                startActivity(intent_help);
            }
        });
        historyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_history=new Intent(MainActivity.this, HistoryActivity1.class);
                startActivity(intent_history);
            }
        });
        settingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_setting=new Intent(MainActivity.this, SettingActivity1.class);
                startActivity(intent_setting);
            }
        });
        trackerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_tracker=new Intent(MainActivity.this, TrackerActivity1.class);
                startActivity(intent_tracker);
            }
        });
        notificationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_notification=new Intent(MainActivity.this, NotificationActivity1.class);
                startActivity(intent_notification);
            }
        });


    }
}