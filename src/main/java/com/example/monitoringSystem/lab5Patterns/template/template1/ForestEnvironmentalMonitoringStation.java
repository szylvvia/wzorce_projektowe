//Tydzień 6, Wzorzec Template Method - stacja monitoringu leśnego
//Konkretna implementacja dla środowiska leśnego
//Specjalizuje proces monitoringu pod kątem ekosystemów leśnych
package com.example.monitoringSystem.lab5Patterns.template.template1;

public class ForestEnvironmentalMonitoringStation extends EnvironmentalMonitoringStationTemplate {

    @Override
    public void turnOnSensors(String type, String location) {
        System.out.println("-> Stacja leśna: włączanie czujników " + type + " w lokalizacji " + location);
    }

    @Override
    public void calibrateSensors(Integer resolution) {
        System.out.println("-> Stacja leśna: kalibracja czujników z rozdzielczością " + resolution + " jednostek");
    }

    @Override
    public void collectData(Integer interval) {
        System.out.println("-> Stacja leśna: zbieranie danych co " + interval + " sekund");
    }

    @Override
    public void turnOffSensors(String type, String location) {
        System.out.println("-> Stacja leśna: wyłączanie czujników " + type + " w lokalizacji " + location);
    }
}

//Koniec, Tydzień 6, Wzorzec Template Method - stacja leśna
