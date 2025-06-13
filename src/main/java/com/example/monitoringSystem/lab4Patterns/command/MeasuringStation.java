//Tydzień 5, Wzorzec Command - receiver dla komend stacji pomiarowej
//Klasa docelowa wykonująca rzeczywiste operacje pomiarowe
//Enkapsuluje logikę biznesową zarządzania pomiarami i kalibracją sensorów
package com.example.monitoringSystem.lab4Patterns.command;

public class MeasuringStation {
    public void startMeasurement() {
        System.out.println("Measurement started.");
    }

    public void stopMeasurement() {
        System.out.println("Measurement stopped.");
    }

    public void calibrateSensor() {
        System.out.println("Sensor calibrated.");
    }
}
//Koniec, Tydzień 5, Wzorzec Command - receiver stacji
