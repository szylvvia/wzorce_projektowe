package com.example.monitoringSystem.lab5Patterns.template.template1;

class CityEnvironmentalMonitoringStation extends EnvironmentalMonitoringStationTemplate{

    @Override
    public void turnOnSensors(String type, String location) {
        System.out.println("-> Stacja miejska: włączanie czujników " + type + " w lokalizacji " + location);
    }

    @Override
    public void calibrateSensors(Integer resolution) {
        System.out.println("-> Stacja miejska: kalibracja czujników z rozdzielczością " + resolution + " jednostek");
    }

    @Override
    public void collectData(Integer interval) {
        System.out.println("-> Stacja miejska: zbieranie danych co " + interval + " sekund");
    }

    @Override
    public void turnOffSensors(String type, String location) {
        System.out.println("-> Stacja miejska: wyłączanie czujników " + type + " w lokalizacji " + location);
    }
}
