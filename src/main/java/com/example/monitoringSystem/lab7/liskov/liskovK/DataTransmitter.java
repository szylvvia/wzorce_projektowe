//Tydzień 8, Zasada LSP - abstrakcyjna klasa transmisji danych
//Klasa bazowa definiująca kontrakt dla wszystkich transmiterów
//Zgodnie z LSP - podklasy muszą zachować semantykę metody transmitData
package com.example.monitoringSystem.lab7.liskov.liskovK;

public abstract class DataTransmitter {
    public abstract void transmitData(String data);
}

//Koniec, Tydzień 8, Zasada LSP - abstrakcyjna klasa transmisji
