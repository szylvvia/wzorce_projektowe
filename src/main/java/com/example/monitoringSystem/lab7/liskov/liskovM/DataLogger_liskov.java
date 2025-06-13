//Tydzień 8, Zasada LSP - logger danych zgodny z Liskov Substitution Principle
//Klasa bazowa może być zastąpiona przez podklasy bez naruszania funkcjonalności
//Implementuje podstawowe funkcje logowania zgodnie z kontraktem bazowym
package com.example.monitoringSystem.lab7.liskov.liskovM;

public abstract class DataLogger_liskov {
    public abstract void log(double value);
}

//Koniec, Tydzień 8, Zasada LSP - logger danych