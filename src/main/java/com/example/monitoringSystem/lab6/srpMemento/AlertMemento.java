//Tydzień 7, Zasada SRP + Wzorzec Memento, memento stanu alertu
//Single Responsibility Principle - odpowiedzialny tylko za przechowywanie stanu alertu
//Wzorzec Memento - enkapsuluje stan alertu w niezmiennej postaci
package com.example.monitoringSystem.lab6.srpMemento;

public class AlertMemento {

    //przechowywanie stanu alertu
    private final String alertMessage;

    public AlertMemento(String alertMessage) {
        this.alertMessage = alertMessage;
    }

    public String getAlertMessage() {
        return alertMessage;
    }
}
//Koniec, Tydzień 7, Zasada SRP + Wzorzec Memento - memento alertu