//Tydzień 8, Zasada LSP - abstrakcyjna klasa sensora
//Klasa bazowa definiująca kontrakt dla wszystkich sensorów
//Zgodnie z LSP - klasy pochodne muszą zachować semantykę klasy bazowej
package com.example.monitoringSystem.lab7.liskov.liskovM;

public abstract class Sensor_liskov {
    public abstract double readValue();
}

//Koniec, Tydzień 8, Zasada LSP - abstrakcyjna klasa sensora
