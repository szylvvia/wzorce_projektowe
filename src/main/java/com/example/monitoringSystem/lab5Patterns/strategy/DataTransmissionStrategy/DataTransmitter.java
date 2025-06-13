//Tydzień 6, Wzorzec Strategy - transmiter danych
//Kontekst używający różnych strategii transmisji danych ze stacji pomiarowych
//Umożliwia dynamiczną zmianę sposobu przesyłania danych bez modyfikacji kodu klienta
package com.example.monitoringSystem.lab5Patterns.strategy.DataTransmissionStrategy;

public class DataTransmitter {
    public String sendData(String data, TransmissionStrategy strategy) {
        return strategy.transmit(data);
    }
}

//Koniec, Tydzień 6, Wzorzec Strategy - transmiter danych