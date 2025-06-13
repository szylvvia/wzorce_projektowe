//Tydzień 8, Zasada LSP - transmiter WiFi zgodny z LSP
//Rozszerza klasę DataTransmitter zachowując jej kontrakt
//Może zastąpić klasę bazową bez naruszania oczekiwanych zachowań
package com.example.monitoringSystem.lab7.liskov.liskovK;

public class WifiTransmitter extends DataTransmitter {
    @Override
    public void transmitData(String data) {

        System.out.println("Transmitting data over WiFi: " + data);
    }
}

//Koniec, Tydzień 8, Zasada LSP - transmiter WiFi
