package com.example.monitoringSystem.lab5Patterns.template.template1;

import java.util.Map;

public class TemplateTester {
    public static void main(String[] args) {
        Map<String, Object> cityData = Map.of(
                "typeMeasurement", "Temperatura",
                "location", "Warszawa",
                "resolution", 5,
                "interval", 10
        );

        Map<String, Object> forestData = Map.of(
                "typeMeasurement", "Wilgotność",
                "location", "Białowieża",
                "resolution", 10,
                "interval", 15
        );

        Map<String, Object> seaData = Map.of(
                "typeMeasurement", "Ciśnienie",
                "location", "Gdańsk",
                "resolution", 15,
                "interval", 20
        );


        // Testowanie wzorca szablonu
        EnvironmentalMonitoringStationTemplate cityStation = new CityEnvironmentalMonitoringStation();
        cityStation.runCycle(cityData);

        EnvironmentalMonitoringStationTemplate forestStation = new ForestEnvironmentalMonitoringStation();
        forestStation.runCycle(forestData);

        EnvironmentalMonitoringStationTemplate seaStation = new SeaEnvironmentalMonitoringStation();
        seaStation.runCycle(seaData);
    }
}
