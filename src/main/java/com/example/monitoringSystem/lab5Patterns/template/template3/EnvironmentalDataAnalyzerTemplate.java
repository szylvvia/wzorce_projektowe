package com.example.monitoringSystem.lab5Patterns.template.template3;

import java.util.Map;

abstract class EnvironmentalDataAnalyzerTemplate {

        public final void analyzeData(Map<String, Double> temperature, Map<String, Double> humidity, Double tempThre, Double humThre) {
            analyze(temperature, humidity);
            checkThreshold(tempThre, humThre);
            prepareAlert(temperature, humidity, tempThre, humThre);
            sendAnalyzedData();
        }

        public void analyze(Map<String, Double> temperature, Map<String, Double> humidity) {
            System.out.println("-> Analiza danych: " + temperature + ", " + humidity);
        }

        public void checkThreshold(Double tempThre, Double humThre) {
            System.out.println("-> Sprawdzanie progów: " + tempThre + ", " + humThre);
        }
        public void prepareAlert(Map<String, Double> temperature, Map<String, Double> humidity, Double tempThre, Double humThre) {
            double tempAvg = temperature.values().stream().mapToDouble(Double::doubleValue).average().orElse(0);
            double humAvg = humidity.values().stream().mapToDouble(Double::doubleValue).average().orElse(0);

            if(tempAvg > tempThre) {
                System.out.println("-> Alert: Wysoka temperatura! Średnia: " + tempAvg);
            }
            if(humAvg > humThre) {
                System.out.println("-> Alert: Wysoka wilgotność! Średnia: " + humAvg);
            }
        }

        public abstract void sendAnalyzedData();
}
