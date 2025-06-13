package com.example.monitoringSystem.lab5Patterns.template.template1;

//Tydzień 6, Wzorzec Template Method - klasa testująca różne implementacje algorytmu monitorowania
//Demonstruje wzorzec Template Method dla stacji monitorowania środowiskowego
//Testuje algorytmy dla miasta, lasu i morza z różnymi krokami implementacji

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
//Koniec, Tydzień 6, Wzorzec Template Method - tester
