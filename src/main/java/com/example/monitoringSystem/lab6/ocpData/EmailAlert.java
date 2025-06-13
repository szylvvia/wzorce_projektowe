//Tydzień 7, Zasada OCP (Open/Closed Principle), implementacja alertu email
//Rozszerza system alertów o powiadomienia email bez modyfikacji istniejącego kodu
//Przykład jak OCP umożliwia dodawanie nowych kanałów komunikacji
package com.example.monitoringSystem.lab6.ocpData;

public class EmailAlert implements AlertStrategy {
    @Override
    public void send(String message) {
        System.out.println("[EMAIL] " + message);
    }
}
//Koniec, Tydzień 7, Zasada OCP - alert email

