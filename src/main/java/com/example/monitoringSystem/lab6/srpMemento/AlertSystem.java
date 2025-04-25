package com.example.monitoringSystem.lab6.srpMemento;

import java.util.ArrayList;
import java.util.List;

public class AlertSystem {

    //logika alertów - obsługa zapisu, odczytu stanu.
    private String lastAlert;

    public void triggerAlert(String message) {
        this.lastAlert = message;
        System.out.println("New alert triggered: " + message);
    }

    public AlertMemento saveToMemento() {
        return new AlertMemento(lastAlert);
    }

    public void restoreFromMemento(AlertMemento memento) {
        if (memento != null) {
            this.lastAlert = memento.getAlertMessage();
            System.out.println("Restored last alert: " + lastAlert);
        }
    }

    public String getLastAlert() {
        return lastAlert;
    }
}
