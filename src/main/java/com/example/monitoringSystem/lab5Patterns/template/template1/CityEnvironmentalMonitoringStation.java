//Tydzień 6, Wzorzec Template Method - stacja monitoringu miejskiego
//Konkretna implementacja stacji dla środowiska miejskiego
//Dostosowuje proces monitoringu do specyfiki pomiarów w mieście
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

//Koniec, Tydzień 6, Wzorzec Template Method - stacja miejska
