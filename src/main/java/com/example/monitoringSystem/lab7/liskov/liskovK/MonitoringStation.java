//Tydzień 8, Zasada LSP - abstrakcyjna klasa stacji monitoringu
//Klasa bazowa definiująca kontrakt dla wszystkich stacji środowiskowych
//Zgodnie z LSP - podklasy mogą zastąpić bez naruszania funkcjonalności
package com.example.monitoringSystem.lab7.liskov.liskovK;

public abstract class MonitoringStation {
    protected String location;

    public MonitoringStation(String location) {
        this.location = location;
    }

    public abstract void collectData();
}

//Koniec, Tydzień 8, Zasada LSP - abstrakcyjna klasa stacji