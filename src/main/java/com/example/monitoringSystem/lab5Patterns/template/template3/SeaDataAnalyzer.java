package com.example.monitoringSystem.lab5Patterns.template.template3;
import java.util.Map;

public class SeaDataAnalyzer extends EnvironmentalDataAnalyzerTemplate {


    @Override
    public void analyze(Map<String, Double> temperature, Map<String, Double> humidity) {
        System.out.println("-> [SEA] Analiza danych z morza: " + temperature + ", " + humidity);
    }

    @Override
    public void checkThreshold(Double temperature, Double humidity) {
        System.out.println("-> [SEA] Sprawdzanie progów z morza: " + temperature + ", " + humidity);
    }

    @Override
    public void prepareAlert(Map<String, Double> temperature, Map<String, Double> humidity, Map<String, Double> thresholds) {
        int otherValue = 0;
        double tempAvg = temperature.values().stream().mapToDouble(Double::doubleValue).average().orElse(otherValue);
        double humAvg = humidity.values().stream().mapToDouble(Double::doubleValue).average().orElse(otherValue);

        if(tempAvg > thresholds.get("Temperature")) {
            System.out.println("-> [SEA ALERT] Wysoka temperatura na morzu! Średnia: " + tempAvg);
        }
        if(humAvg > thresholds.get("Humidity")) {
            System.out.println("-> [SEA ALERT] Wysoka wilgotność na morzu! Średnia: " + humAvg);
        }
    }

    @Override
    public void sendAnalyzedData() {
        System.out.println("-> [SEA] Wysyłanie danych do systemu morskiego....\n");
    }

}
