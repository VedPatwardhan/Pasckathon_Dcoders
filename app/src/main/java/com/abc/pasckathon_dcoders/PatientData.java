package com.abc.pasckathon_dcoders;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PatientData {
    String name;
    String userName;
    String password;
    String address;
    String region;
    String email_id;
    long aadhar_card_no;
    long phone_number;
    String disease;
    int severity;
    ArrayList<String> medicines=new ArrayList<>();
    ArrayList<Integer> numberPerDay=new ArrayList<>();
    HashMap<String,Integer> toBeTaken=new HashMap<>();
    HashMap<String,Integer> stock=new HashMap<>();
    public PatientData()
    {

    }
    public PatientData(String u, String p)
    {
        this.userName=u;
        this.password=p;
        this.address="";
        this.region="";
        this.email_id="";
        this.disease="";
        this.severity=0;
        this.aadhar_card_no=0;
        this.phone_number=0;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public void setAadhar_card_no(long aadhar_card_no) {
        this.aadhar_card_no = aadhar_card_no;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getRegion() {
        return region;
    }

    public String getEmail_id() {
        return email_id;
    }

    public long getAadhar_card_no() {
        return aadhar_card_no;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setDiseaseStuff(String d, int s)
    {
        int a,b,c;
        if(s==1)
        {
            this.numberPerDay.add(1);
            this.numberPerDay.add(1);
            this.numberPerDay.add(1);
        }
        else if(s==2)
        {
            this.numberPerDay.add(2);
            this.numberPerDay.add(2);
            this.numberPerDay.add(1);
        }
        else if(s==3)
        {
            this.numberPerDay.add(3);
            this.numberPerDay.add(2);
            this.numberPerDay.add(2);
        }
        this.disease=d;
        this.severity=s;
        medicines=MainActivity.diseaseMedicine.get(this.disease);
        for(int i=0;i<medicines.size();i++)
        {
            toBeTaken.put(medicines.get(i),numberPerDay.get(i));
        }
        for(int i=0;i<medicines.size();i++)
        {
            stock.put(medicines.get(i),numberPerDay.get(i)*14);
        }
    }
}
