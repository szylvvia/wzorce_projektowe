package com.example.monitoringSystem.lab4Patterns.memento.Alert;

import java.util.ArrayList;
import java.util.List;

public class AlertSystem {
    private String lastAlert;
    private List<AlertMemento> alertHistory = new ArrayList<>();

    public void triggerAlert(String message) {
        this.lastAlert = message;
        alertHistory.add(new AlertMemento(message));
        System.out.println("New alert triggered: " + message);
    }

    public AlertMemento getLastAlert() {
        if (alertHistory.isEmpty()) return null;
        return alertHistory.get(alertHistory.size() - 1);
    }

    public void restoreLastAlert(AlertMemento memento) {
        if (memento != null) {
            this.lastAlert = memento.getAlertMessage();
            System.out.println("Restored last alert: " + lastAlert);
        }
    }
}
