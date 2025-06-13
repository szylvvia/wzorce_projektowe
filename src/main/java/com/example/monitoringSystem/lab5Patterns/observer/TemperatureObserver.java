//Tydzień 6, Wzorzec Observer - obserwator pomiarów temperatury
//Konkretny obserwator śledzący zmiany temperatur w systemie monitoringu
//Otrzymuje powiadomienia o nowych odczytach temperaturowych
package com.example.monitoringSystem.lab5Patterns.observer;

public class TemperatureObserver implements Observer {
    @Override
    public void update(float temperature, float pressure, float humidity) {
        System.out.println("TemperatureObserver: Temperature updated to " + temperature + "°C");
    }
}

//Koniec, Tydzień 6, Wzorzec Observer - obserwator temperatury