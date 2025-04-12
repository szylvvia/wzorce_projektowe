package com.example.monitoringSystem.lab5Patterns.template.template3;

import java.util.Date;
import java.util.Map;

public class AnalyzerTester {
    public static void main(String[] args) {

        String city1 = "Warszawa";
        String city2 = "Kraków";
        String city3 = "Wrocław";
        Double cityTempThre = 30.0;
        Double cityHumThre = 80.0;
        Double forestTempThre = 25.0;
        Double forestHumThre = 70.0;
        Double seaTempThre = 28.0;
        Double seaHumThre = 75.0;

        Map<String, Double> temperature = Map.of("2022-10-11", 32.0, "2022-10-12", 29.0, "2022-10-13", 31.0);
        Map<String, Double> humidity = Map.of("2022-10-11", 85.0, "2022-10-12", 78.0, "2022-10-13", 82.0);
        Map<String, Double> temperature2 = Map.of("2022-10-11", 22.0, "2022-10-12", 20.0, "2022-10-13", 21.0);
        Map<String, Double> humidity2 = Map.of("2022-10-11", 65.0, "2022-10-12", 70.0, "2022-10-13", 68.0);

        EnvironmentalDataAnalyzerTemplate cityAnalyzer = new CityDataAnalyzer();
        cityAnalyzer.analyzeData(temperature, humidity, cityTempThre, cityHumThre);

        EnvironmentalDataAnalyzerTemplate forestAnalyzer = new ForestDataAnalyzer();
        forestAnalyzer.analyzeData(temperature2, humidity, forestTempThre, forestHumThre);

        EnvironmentalDataAnalyzerTemplate seaAnalyzer = new SeaDataAnalyzer();
        seaAnalyzer.analyzeData(temperature, humidity2, seaTempThre, seaHumThre);
    }
}
