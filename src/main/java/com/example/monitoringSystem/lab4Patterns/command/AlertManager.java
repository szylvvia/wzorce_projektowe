package com.example.monitoringSystem.lab4Patterns.command;

//Tydzień 5, Wzorzec Command, receiver wykonujący rzeczywiste operacje wysyłania alertów
public class AlertManager {
    public void sendSmsAlert(String message) {
        System.out.println("[SMS Alert] " + message);
    }

    public void sendEmailAlert(String message) {
        System.out.println("[Email Alert] " + message);
    }

    public void sendPushAlert(String message) {
        System.out.println("[Push Alert] " + message);
    }
}
//Koniec, Tydzień 5, Wzorzec Command