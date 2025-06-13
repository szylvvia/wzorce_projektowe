//Tydzień 8, Zasada DIP (Dependency Inversion Principle), implementacja transmisji HTTP
//Konkretna implementacja abstrakcji DataTransmitter zgodnie z zasadą DIP
//Szczegół implementacyjny, który nie wpływa na moduły wysokopoziomowe używające abstrakcji
package com.example.monitoringSystem.lab7.dip.dipK;

public class HttpDataTransmitter extends AbstractDataTransmitter {
    public HttpDataTransmitter(String endpoint) {
        super(endpoint);
    }

    @Override
    public void transmit(String data) {
        System.out.println("Transmitting via HTTP to " + endpoint + ": " + data);
    }
}
//Koniec, Tydzień 8, Zasada DIP - transmisja HTTP

