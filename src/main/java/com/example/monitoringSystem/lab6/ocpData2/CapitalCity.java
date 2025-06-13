package com.example.monitoringSystem.lab6.ocpData2;

//Tydzień 7, Zasada OCP (Open/Closed Principle), implementacja miasta stołecznego
//Dodaje nowy typ miasta bez naruszania istniejącej struktury kodu
//Przykład rozszerzania hierarchii miast zgodnie z zasadą OCP
public class CapitalCity implements ICity{
    private String name;

    public CapitalCity(String name) {
        this.name = name;
    }

    @Override
    public void checkWeather() {
        int temperatureMultiplier = 40;
        double temperature = Math.random() * temperatureMultiplier;
        System.out.println("[CITY] Temperature in " + name + ": " + temperature + "°C");
    }
}
//Koniec, Tydzień 7, Zasada OCP - miasto stołeczne
