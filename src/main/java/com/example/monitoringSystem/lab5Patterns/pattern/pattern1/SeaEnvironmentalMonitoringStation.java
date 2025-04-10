package com.example.monitoringSystem.lab5Patterns.pattern.pattern1;

public class SeaEnvironmentalMonitoringStation extends EnvironmentalMonitoringStationTemplate {

    @Override
    public void turnOnSensors(String type, String location) {
        System.out.println("-> Stacja morska: włączanie czujników " + type + " w lokalizacji " + location);
    }

    @Override
    public void calibrateSensors(Integer resolution) {
        System.out.println("-> Stacja morska: kalibracja czujników z rozdzielczością " + resolution + " jednostek");
    }

    @Override
    public void collectData(Integer interval) {
        System.out.println("-> Stacja morska: zbieranie danych co " + interval + " sekund");
    }

    @Override
    public void turnOffSensors(String type, String location) {
        System.out.println("-> Stacja morska: wyłączanie czujników " + type + " w lokalizacji " + location);
    }
}
