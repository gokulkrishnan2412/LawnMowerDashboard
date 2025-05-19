
package com.example.lawnmowerdashboard.model;

public class LawnMowerData {
    private boolean batteryOn;
    private int rpm;
    private double speed;
    private boolean ignitionOn;

    public boolean isBatteryOn() { return batteryOn; }
    public void setBatteryOn(boolean batteryOn) { this.batteryOn = batteryOn; }

    public int getRpm() { return rpm; }
    public void setRpm(int rpm) { this.rpm = rpm; }

    public double getSpeed() { return speed; }
    public void setSpeed(double speed) { this.speed = speed; }

    public boolean isIgnitionOn() { return ignitionOn; }
    public void setIgnitionOn(boolean ignitionOn) { this.ignitionOn = ignitionOn; }
}
