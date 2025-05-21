package com.example.monitoringSystem.lab5Patterns.template.template3;

import java.util.Map;

public class AnalyzerTester {
    public static void main(String[] args) {
        Map<String, Double> cityThresholds = Map.of("Temperature", 30.0, "Humidity", 80.0);
        Map<String, Double> forestThresholds = Map.of("Temperature", 25.0, "Humidity", 70.0);
        Map<String, Double> seaThresholds = Map.of("Temperature", 28.0, "Humidity", 75.0);

        Map<String, Double> temperature = Map.of("2022-10-11", 32.0, "2022-10-12", 29.0, "2022-10-13", 31.0);
        Map<String, Double> humidity = Map.of("2022-10-11", 85.0, "2022-10-12", 78.0, "2022-10-13", 82.0);
        Map<String, Double> temperature2 = Map.of("2022-10-11", 22.0, "2022-10-12", 20.0, "2022-10-13", 21.0);
        Map<String, Double> humidity2 = Map.of("2022-10-11", 65.0, "2022-10-12", 70.0, "2022-10-13", 68.0);

        EnvironmentalDataAnalyzerTemplate cityAnalyzer = new CityDataAnalyzer();
        cityAnalyzer.analyzeData(temperature, humidity, cityThresholds);

        EnvironmentalDataAnalyzerTemplate forestAnalyzer = new ForestDataAnalyzer();
        forestAnalyzer.analyzeData(temperature2, humidity, forestThresholds);

        EnvironmentalDataAnalyzerTemplate seaAnalyzer = new SeaDataAnalyzer();
        seaAnalyzer.analyzeData(temperature, humidity2, seaThresholds);
    }
}
