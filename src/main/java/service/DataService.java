
package com.example.lawnmowerdashboard.service;

import com.example.lawnmowerdashboard.model.LawnMowerData;

public class DataService {
    public LawnMowerData fetchData() {
        LawnMowerData data = new LawnMowerData();
        data.setBatteryOn(true);
        data.setRpm(3200);
        data.setSpeed(5.6);
        data.setIgnitionOn(true);
        return data;
    }
}
