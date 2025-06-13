//Tydzień 6, Wzorzec Observer - obserwator pomiarów ciśnienia
//Konkretny obserwator reagujący na zmiany ciśnienia atmosferycznego
//Implementuje interfejs Observer do otrzymywania powiadomień o nowych pomiarach
package com.example.monitoringSystem.lab5Patterns.observer;

public class PressureObserver implements Observer {
    @Override
    public void update(float temperature, float pressure, float humidity) {
        System.out.println("PressureObserver: Pressure updated to " + pressure + " hPa");
    }
}
//Koniec, Tydzień 6, Wzorzec Observer - obserwator ciśnienia
