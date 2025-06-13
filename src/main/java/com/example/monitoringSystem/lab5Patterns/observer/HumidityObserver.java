//Tydzień 6, Wzorzec Observer - obserwator pomiarów wilgotności
//Konkretny obserwator monitorujący zmiany poziomu wilgotności
//Reaguje na aktualizacje danych wilgotnościowych z stacji pomiarowej
package com.example.monitoringSystem.lab5Patterns.observer;

public class HumidityObserver implements Observer {
    @Override
    public void update(float temperature, float pressure, float humidity) {
        System.out.println("HumidityObserver: Humidity updated to " + humidity + "%");
    }
}
//Koniec, Tydzień 6, Wzorzec Observer - obserwator wilgotności