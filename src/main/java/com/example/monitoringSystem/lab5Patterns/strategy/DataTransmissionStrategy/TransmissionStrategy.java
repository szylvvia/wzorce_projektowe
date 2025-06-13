//Tydzień 6, Wzorzec Strategy - interfejs strategii transmisji danych
//Definiuje kontrakt dla wszystkich strategii przesyłania danych pomiarowych
//Umożliwia wymienność algorytmów transmisji zgodnie z wzorcem Strategy
package com.example.monitoringSystem.lab5Patterns.strategy.DataTransmissionStrategy;

public interface TransmissionStrategy {
    String transmit(String data);
}

//Koniec, Tydzień 6, Wzorzec Strategy - interfejs transmisji
