package com.example.monitoringSystem.lab7.liskov.liskovS;

public class City {
    private String name;

    public City(String name) {
        this.name = name;
    }

    public void updateWeather() {
        System.out.println("Zaktualizowanie pogody w mieście: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
