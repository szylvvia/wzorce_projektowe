package com.example.monitoringSystem.lab1Patterns.prototype;

//Tydzień 2, Klasa City dla wzorca Prototype
//Model miasta wykorzystywany w prototypie kraju
//Reprezentuje dane o miastach w systemie klonowania geograficznego
public class City {
    public String name;
    public int population;
    public boolean capital;

    public City(String name, int population, boolean capital) {
        this.name = name;
        this.population = population;
        this.capital = capital;
    }

}
//Koniec, Tydzień 2, Klasa City dla wzorca Prototype
