package com.example.monitoringSystem.lab7.liskov.liskovM;

public class TemperatureAlertSystem_liskov extends AlertSystem_liskov {
    @Override
    public void checkAndAlert(double value) {
        int threshold = 30;
        if (value > threshold) {
            System.out.println("ALERT: Zbyt wysoka temperatura!");
        }
    }
}
