//Tydzień 8, Zasada LSP - sensor temperatury zgodny z LSP
//Rozszerza klasę Sensor_liskov zachowując jej kontrakt
//Może zastąpić klasę bazową bez naruszania oczekiwanych zachowań
package com.example.monitoringSystem.lab7.liskov.liskovM;

public class TemperatureSensorLiskov extends Sensor_liskov {
    @Override
    public double readValue() {
        return 32.5;
    }
}

//Koniec, Tydzień 8, Zasada LSP - sensor temperatury