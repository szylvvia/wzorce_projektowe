//Tydzień 7, Zasada OCP (Open/Closed Principle), implementacja miasta aglomeracyjnego
//Rozszerza system miast o obsługę aglomeracji bez modyfikacji istniejącego kodu
//Przykład jak OCP pozwala na dodawanie nowych typów encji miejskich
package com.example.monitoringSystem.lab6.ocpData2;

import java.util.ArrayList;
import java.util.List;

public class AglomerationCity implements ICity{
    private String name;

    public AglomerationCity(String name) {
        this.name = name;
    }

    @Override
    public void checkWeather() {
        int loopCount = 3;
        int temperatureMultiplier = 40;
        System.out.print("[CITY] Temperatures in " + name + ": ");
        for (int i = 0; i < loopCount; i++) {
           System.out.print((Math.random() * temperatureMultiplier) + "°C, ");
        }
        System.out.println();
    }
}
//Koniec, Tydzień 7, Zasada OCP - miasto aglomeracyjne
