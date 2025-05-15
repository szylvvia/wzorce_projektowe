package com.example.monitoringSystem.lab7.liskov.liskovM;

public class TemperatureAlertSystem_liskov extends AlertSystem_liskov {
    @Override
    public void checkAndAlert(double value) {
        if (value > 30.0) {
            System.out.println("ALERT: Zbyt wysoka temperatura!");
        }
    }
}
