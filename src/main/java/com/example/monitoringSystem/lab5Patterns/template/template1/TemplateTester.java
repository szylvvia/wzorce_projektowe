package com.example.monitoringSystem.lab5Patterns.template.template1;

public class TemplateTester {
    public static void main(String[] args) {

        // Przykładowe dane do testowania
        String cityTypeMeasurement = "Temperatura";
        String cityLocation = "Warszawa";
        Integer cityResolution = 5;
        Integer cityInterval = 10;
        String forestTypeMeasurement = "Wilgotność";
        String forestLocation = "Białowieża";
        Integer forestResolution = 10;
        Integer forestInterval = 15;
        String seaTypeMeasurement = "Wiatr";
        String seaLocation = "Bałtyk";
        Integer seaResolution = 20;
        Integer seaInterval = 30;

        // Testowanie wzorca szablonu
        EnvironmentalMonitoringStationTemplate cityStation = new CityEnvironmentalMonitoringStation();
        cityStation.runCycle(cityTypeMeasurement, cityLocation, cityResolution, cityInterval);

        EnvironmentalMonitoringStationTemplate forestStation = new ForestEnvironmentalMonitoringStation();
        forestStation.runCycle(forestTypeMeasurement, forestLocation, forestResolution, forestInterval);

        EnvironmentalMonitoringStationTemplate seaStation = new SeaEnvironmentalMonitoringStation();
        seaStation.runCycle(seaTypeMeasurement, seaLocation, seaResolution, seaInterval);
    }
}
