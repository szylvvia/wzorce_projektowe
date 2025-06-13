package com.example.monitoringSystem.lab3Patterns.Proxy.P3;

// Tydzień 4, Proxy Pattern, Rzeczywista zdalna stacja pomiarowa - obiekt docelowy
public class RemoteMeasuringStation implements MeasuringStationP3 {
    @Override
    public String fetchDataP3() {
        return "Remote Proxy: Retrieved data from remote measuring station.";
    }
}
// Koniec, Tydzień 4, Proxy Pattern
