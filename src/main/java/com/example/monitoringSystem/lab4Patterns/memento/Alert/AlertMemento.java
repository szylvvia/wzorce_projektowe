//Tydzień 5, Wzorzec Memento - memento alertu systemu
//Snapshot stanu systemu alertów w określonym momencie czasu
//Przechowuje konfigurację alertów dla funkcjonalności cofania zmian
package com.example.monitoringSystem.lab4Patterns.memento.Alert;

public class AlertMemento {
    private final String alertMessage;

    public AlertMemento(String alertMessage) {
        this.alertMessage = alertMessage;
    }

    public String getAlertMessage() {
        return alertMessage;
    }
}
//Koniec, Tydzień 5, Wzorzec Memento - memento alertu