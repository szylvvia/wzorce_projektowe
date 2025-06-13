//Tydzień 7, Zasada OCP (Open/Closed Principle), implementacja alertu SMS
//Rozszerza możliwości systemu alertów o powiadomienia SMS
//Demonstruje jak dodawać nowe kanały komunikacji bez zmiany istniejącego kodu
package com.example.monitoringSystem.lab6.ocpData;

public class SmsAlert implements AlertStrategy {
    @Override
    public void send(String message) {
        System.out.println("[SMS] " + message);
    }
}
//Koniec, Tydzień 7, Zasada OCP - alert SMS
