//Tydzień 7, Zasada OCP (Open/Closed Principle), implementacja miasta aglomeracyjnego
//Rozszerza system o nową funkcjonalność obsługi aglomeracji bez modyfikacji kodu bazowego
//Demonstruje jak OCP pozwala na dodawanie nowych typów miast z własną logiką
package com.example.monitoringSystem.lab6.ocpAbstract2;

import java.util.ArrayList;
import java.util.List;

public class AglomerationCity extends ACity{
    private List<String> cities = new ArrayList<>();
    private String nameAgl;

    public AglomerationCity(String nameAgl, List<String> cities) {
        this.nameAgl = nameAgl;
        this.cities = cities;
    }

    @Override
    void updateWeather() {
        System.out.print("Updating weather for agglomeration city " + nameAgl+": ");
        for (String city : cities) {
            System.out.print(city+", ");
        }
        System.out.println();
    }
}
//Koniec, Tydzień 7, Zasada OCP - miasto aglomeracyjne
