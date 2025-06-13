//Tydzień 8, Zasada LSP - miasto przemysłowe zgodne z LSP
//Rozszerza klasę City zachowując zgodność z kontraktem bazowym
//Dodaje specjalistyczne zachowania dla miast przemysłowych
package com.example.monitoringSystem.lab7.liskov.liskovS;

public class IndustrialCity extends City {

    public IndustrialCity(String name) {
        super(name);
    }

    @Override
    public void updateWeather() {
        System.out.println("[INDUSTRIAL] Zaktualizowanie pogody w mieście przemysłowym: " + getName());
    }

}

//Koniec, Tydzień 8, Zasada LSP - miasto przemysłowe
