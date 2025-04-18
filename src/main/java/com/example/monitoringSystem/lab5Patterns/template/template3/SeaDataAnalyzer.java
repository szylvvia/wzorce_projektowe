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
    public void prepareAlert(Map<String, Double> temperature, Map<String, Double> humidity, Double tempThre, Double humThre) {
        double tempAvg = temperature.values().stream().mapToDouble(Double::doubleValue).average().orElse(0);
        double humAvg = humidity.values().stream().mapToDouble(Double::doubleValue).average().orElse(0);

        if(tempAvg > tempThre) {
            System.out.println("-> [SEA ALERT] Wysoka temperatura na morzu! Średnia: " + tempAvg);
        }
        if(humAvg > humThre) {
            System.out.println("-> [SEA ALERT] Wysoka wilgotność na morzu! Średnia: " + humAvg);
        }
    }

    @Override
    public void sendAnalyzedData() {
        System.out.println("-> [SEA] Wysyłanie danych do systemu morskiego....\n");
    }

}
