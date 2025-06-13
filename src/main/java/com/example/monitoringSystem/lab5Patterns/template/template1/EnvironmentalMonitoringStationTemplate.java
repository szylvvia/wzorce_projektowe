//Tydzień 6, Wzorzec Template Method - abstrakcyjna klasa szablonu
//Definiuje szkielet algorytmu monitorowania środowiskowego w metodzie runCycle()
//Kroki szczegółowe są implementowane w klasach pochodnych dla różnych środowisk
package com.example.monitoringSystem.lab5Patterns.template.template1;

import java.util.Map;

abstract class EnvironmentalMonitoringStationTemplate {

    //change function to get max 3 params
    public final void runCycle(Map<String, Object> data) {
        System.out.println("--- Uruchomiono cykl monitorowania środowiska ---");
        String type = (String) data.get("typeMeasurement");
        String location = (String) data.get("location");
        Integer resolution = (Integer) data.get("resolution");
        Integer interval = (Integer) data.get("interval");

        turnOnSensors(type, location);
        calibrateSensors(resolution);
        collectData(interval);
        sendData();
        turnOffSensors(type, location);
        System.out.println("--- Zakończono cykl monitorowania środowiska ---\n");
    }

    // Defaultowe implementacja metody
    private void sendData(){
        System.out.println("-> Wysyłanie danych do serwera");
    }

    // Abstract methods to be implemented by subclasses
    public abstract void turnOnSensors(String type, String location);
    public abstract void calibrateSensors(Integer resolution);
    public abstract void collectData(Integer interval);
    public abstract void turnOffSensors(String type, String location);
}
//Koniec, Tydzień 6, Wzorzec Template Method - klasa bazowa
