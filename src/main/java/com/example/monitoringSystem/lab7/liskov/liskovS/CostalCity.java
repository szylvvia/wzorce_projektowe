//Tydzień 8, Zasada LSP - miasto nadmorskie
//Rozszerza klasę City zachowując zgodność z kontraktem bazowym
//Dodaje specjalistyczne zachowania dla miast położonych nad morzem
package com.example.monitoringSystem.lab7.liskov.liskovS;

public class CostalCity extends City {

    public CostalCity(String name) {
        super(name);
    }

    @Override
    public void updateWeather() {
        System.out.println("[COSTAL] Zaktualizowanie pogody w mieście nadmorskim: " + getName());
    }
}

//Koniec, Tydzień 8, Zasada LSP - miasto nadmorskie
