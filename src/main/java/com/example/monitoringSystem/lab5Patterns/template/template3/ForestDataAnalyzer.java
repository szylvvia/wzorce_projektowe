package com.example.monitoringSystem.lab5Patterns.template.template3;
import java.util.Map;

public class ForestDataAnalyzer extends EnvironmentalDataAnalyzerTemplate {


    @Override
    public void analyze(Map<String, Double> temperature, Map<String, Double> humidity) {
        System.out.println("-> [FOREST] Analiza danych leśnych: " + temperature + ", " + humidity);
    }

    @Override
    public void checkThreshold(Double temperature, Double humidity) {
        System.out.println("-> [FOREST] Sprawdzanie progów leśnych: " + temperature + ", " + humidity);
    }

    @Override
    public void prepareAlert(Map<String, Double> temperature, Map<String, Double> humidity, Double tempThre, Double humThre) {
        int otherValue = 0;
        double tempAvg = temperature.values().stream().mapToDouble(Double::doubleValue).average().orElse(otherValue);
        double humAvg = humidity.values().stream().mapToDouble(Double::doubleValue).average().orElse(otherValue);

        if(tempAvg > tempThre) {
            System.out.println("-> [FOREST ALERT] Wysoka temperatura w lesie! Średnia: " + tempAvg);
        }
        if(humAvg > humThre) {
            System.out.println("-> [FOREST ALERT] Wysoka wilgotność w lesie! Średnia: " + humAvg);
        }
    }

    @Override
    public void sendAnalyzedData() {
        System.out.println("-> [FOREST] Wysyłanie danych do systemu leśnego....\n");
    }

}
