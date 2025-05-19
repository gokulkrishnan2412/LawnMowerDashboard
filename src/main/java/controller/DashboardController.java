
package com.example.lawnmowerdashboard.controller;

import com.example.lawnmowerdashboard.model.LawnMowerData;
import com.example.lawnmowerdashboard.service.DataService;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DashboardController {

    @FXML private Label batteryLabel;
    @FXML private Label rpmLabel;
    @FXML private Label speedLabel;
    @FXML private Label ignitionLabel;

    private final DataService service = new DataService();

    @FXML
    public void initialize() {
        updateUI();
    }

    @FXML
    private void onRefresh() {
        updateUI();
    }

    private void updateUI() {
        LawnMowerData data = service.fetchData();
        batteryLabel.setText("Battery: " + (data.isBatteryOn() ? "ON" : "OFF"));
        rpmLabel.setText("RPM: " + data.getRpm());
        speedLabel.setText("Speed: " + data.getSpeed() + " km/h");
        ignitionLabel.setText("Ignition: " + (data.isIgnitionOn() ? "ON" : "OFF"));
    }
}
