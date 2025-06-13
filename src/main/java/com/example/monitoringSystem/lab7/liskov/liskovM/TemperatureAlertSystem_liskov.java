//Tydzień 8, Zasada LSP - system alertów temperatury zgodny z LSP
//Rozszerza klasę AlertSystem_liskov zachowując jej kontrakt
//Dodaje specjalistyczne funkcje dla alertów temperaturowych
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

//Koniec, Tydzień 8, Zasada LSP - system alertów temperatury
