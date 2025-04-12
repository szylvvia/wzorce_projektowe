package com.example.monitoringSystem.lab5Patterns.template.template3;
import java.util.Map;

public class CityDataAnalyzer extends EnvironmentalDataAnalyzerTemplate {


    @Override
    public void analyze(Map<String, Double> temperature, Map<String, Double> humidity) {
        System.out.println("-> Analiza danych miejskich: " + temperature + ", " + humidity);
    }

    @Override
    public void checkThreshold(Double temperature, Double humidity) {
        System.out.println("-> Sprawdzanie progów miejskich: " + temperature + ", " + humidity);
    }

    @Override
    public void prepareAlert(Map<String, Double> temperature, Map<String, Double> humidity, Double tempThre, Double humThre) {
        double tempAvg = temperature.values().stream().mapToDouble(Double::doubleValue).average().orElse(0);
        double humAvg = humidity.values().stream().mapToDouble(Double::doubleValue).average().orElse(0);

        if(tempAvg > tempThre) {
            System.out.println("-> [CITY ALERT] Wysoka temperatura w mieście! Średnia: " + tempAvg);
        }
        if(humAvg > humThre) {
            System.out.println("-> [CITY ALERT] Wysoka wilgotność w mieście! Średnia: " + humAvg);
        }
    }

    @Override
    public void sendAnalyzedData() {
        System.out.println("-> Wysyłanie danych do systemu miejskiego....\n");
    }

}
