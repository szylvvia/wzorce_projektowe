//Tydzień 6, Wzorzec Template Method - analizator danych leśnych
//Konkretna implementacja analizy danych dla środowiska leśnego
//Specjalizuje algorytm analizy pod kątem ekosystemów leśnych i ich specyfiki
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
    public void prepareAlert(Map<String, Double> temperature, Map<String, Double> humidity, Map<String, Double> thresholds) {
        int otherValue = 0;
        double tempAvg = temperature.values().stream().mapToDouble(Double::doubleValue).average().orElse(otherValue);
        double humAvg = humidity.values().stream().mapToDouble(Double::doubleValue).average().orElse(otherValue);

        if(tempAvg > thresholds.get("Temperature")) {
            System.out.println("-> [FOREST ALERT] Wysoka temperatura w lesie! Średnia: " + tempAvg);
        }
        if(humAvg > thresholds.get("Humidity")) {
            System.out.println("-> [FOREST ALERT] Wysoka wilgotność w lesie! Średnia: " + humAvg);
        }
    }

    @Override
    public void sendAnalyzedData() {
        System.out.println("-> [FOREST] Wysyłanie danych do systemu leśnego....\n");
    }

}

//Koniec, Tydzień 6, Wzorzec Template Method - analizator leśny
