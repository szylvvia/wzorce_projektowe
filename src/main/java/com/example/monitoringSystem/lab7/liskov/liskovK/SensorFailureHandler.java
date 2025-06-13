//Tydzień 8, Zasada LSP - handler awarii sensorów zgodny z LSP
//Rozszerza klasę EventHandler zachowując jej kontrakt
//Implementuje specjalistyczne funkcje obsługi awarii bez naruszania LSP
package com.example.monitoringSystem.lab7.liskov.liskovK;

public class SensorFailureHandler extends EventHandler {
    @Override
    public void handleEvent(String event) {

        System.out.println("Handling sensor failure: " + event);
    }
}

//Koniec, Tydzień 8, Zasada LSP - handler awarii sensorów
