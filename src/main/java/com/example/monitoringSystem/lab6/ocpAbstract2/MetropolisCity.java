//Tydzień 7, Zasada OCP (Open/Closed Principle), implementacja miasta metropolitalnego
//Dodaje nową funkcjonalność obsługi dużych miast bez zmiany istniejącego kodu
//Demonstruje rozszerzalność systemu zgodnie z zasadą OCP
package com.example.monitoringSystem.lab6.ocpAbstract2;

public class MetropolisCity extends ACity {
    private String name;
    private int population;

    public MetropolisCity(String name, int population) {
        this.name = name;
        this.population = population;
    }

    @Override
    void updateWeather() {
        System.out.println("Updating weather for " + name + " with population " + population);
    }
}
//Koniec, Tydzień 7, Zasada OCP - miasto metropolitalne
