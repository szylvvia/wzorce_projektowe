package com.example.monitoringSystem.lab4Patterns.iterator;

public class AlertHistory {
    private String[] alerts = new String[50];
    private int count = 0;

    public void addAlert(String alert) {
        if (count < alerts.length) {
            alerts[count++] = alert;
        }
    }

    public MyIterator<String> createIterator() {
        return new AlertHistoryIterator(alerts, count);
    }
}
