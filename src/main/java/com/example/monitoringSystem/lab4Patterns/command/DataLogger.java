//Tydzień 5, Wzorzec Command - receiver dla komend logowania danych
//Klasa docelowa która wykonuje rzeczywiste operacje logowania
//Enkapsuluje logikę biznesową systemu logowania danych pomiarowych
package com.example.monitoringSystem.lab4Patterns.command;

public class DataLogger {
    public void startLogging() {
        System.out.println("Data logging started.");
    }

    public void stopLogging() {
        System.out.println("Data logging stopped.");
    }

    public void clearLog() {
        System.out.println("Data log cleared.");
    }
}
//Koniec, Tydzień 5, Wzorzec Command - receiver logowania
