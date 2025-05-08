package com.example.monitoringSystem.lab7.LiskoM;

public class TemperatureAlertSystem7  extends AlertSystem7 {
    @Override
    public void checkAndAlert(double value) {
        if (value > 30.0) {
            System.out.println("ALERT: Zbyt wysoka temperatura!");
        }
    }
}
