package com.abc.pasckathon_dcoders;

import java.util.ArrayList;
import java.util.HashMap;

public class MedicalShops {
    String name;
    String regionName;
    HashMap<String, Integer> stock=new HashMap<>();
    public MedicalShops()
    {

    }
    public MedicalShops(String n, String r, ArrayList<String> names, ArrayList<Integer> quantities) {
        this.name=n;
        this.regionName=r;
        for (int i = 0; i < names.size(); i++)
        {
            stock.put(names.get(i),quantities.get(i));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public HashMap<String, Integer> getStock() {
        return stock;
    }

    public void setStock(HashMap<String, Integer> stock) {
        this.stock = stock;
    }
}
