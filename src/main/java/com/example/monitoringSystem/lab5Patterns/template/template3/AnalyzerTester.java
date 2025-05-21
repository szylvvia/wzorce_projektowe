package com.example.monitoringSystem.lab5Patterns.template.template3;

import java.util.Map;

public class AnalyzerTester {
    public static void main(String[] args) {

        String city1 = "Warszawa";
        String city2 = "Kraków";
        String city3 = "Wrocław";
        Double cityTempThreshold = 30.0;
        Double cityHumThreshold = 80.0;
        Double forestTempThreshold = 25.0;
        Double forestHumThreshold = 70.0;
        Double seaTempThreshold = 28.0;
        Double seaHumThreshold = 75.0;

        Map<String, Double> temperature = Map.of("2022-10-11", 32.0, "2022-10-12", 29.0, "2022-10-13", 31.0);
        Map<String, Double> humidity = Map.of("2022-10-11", 85.0, "2022-10-12", 78.0, "2022-10-13", 82.0);
        Map<String, Double> temperature2 = Map.of("2022-10-11", 22.0, "2022-10-12", 20.0, "2022-10-13", 21.0);
        Map<String, Double> humidity2 = Map.of("2022-10-11", 65.0, "2022-10-12", 70.0, "2022-10-13", 68.0);

        EnvironmentalDataAnalyzerTemplate cityAnalyzer = new CityDataAnalyzer();
        cityAnalyzer.analyzeData(temperature, humidity, cityTempThreshold, cityHumThreshold);

        EnvironmentalDataAnalyzerTemplate forestAnalyzer = new ForestDataAnalyzer();
        forestAnalyzer.analyzeData(temperature2, humidity, forestTempThreshold, forestHumThreshold);

        EnvironmentalDataAnalyzerTemplate seaAnalyzer = new SeaDataAnalyzer();
        seaAnalyzer.analyzeData(temperature, humidity2, seaTempThreshold, seaHumThreshold);
    }
}
