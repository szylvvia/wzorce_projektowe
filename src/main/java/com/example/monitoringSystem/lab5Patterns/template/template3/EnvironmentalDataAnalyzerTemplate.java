//Tydzień 6, Wzorzec Template Method - abstrakcyjna klasa analizatora danych środowiskowych
//Definiuje szkielet algorytmu analizy danych z różnych środowisk
//Pozwala na specjalizację kroków analizy przez klasy pochodne
package com.example.monitoringSystem.lab5Patterns.template.template3;

import java.util.Map;

abstract class EnvironmentalDataAnalyzerTemplate {

        public final void analyzeData(Map<String, Double> temperature, Map<String, Double> humidity, Map<String,Double> thresholds) {
            analyze(temperature, humidity);
            checkThreshold(thresholds.get("Temperature"), thresholds.get("Humidity"));
            prepareAlert(temperature, humidity, thresholds);
            sendAnalyzedData();
        }

        public void analyze(Map<String, Double> temperature, Map<String, Double> humidity) {
            System.out.println("-> Analiza danych: " + temperature + ", " + humidity);
        }

        public void checkThreshold(Double tempThre, Double humThre) {
            System.out.println("-> Sprawdzanie progów: " + tempThre + ", " + humThre);
        }
        public void prepareAlert(Map<String, Double> temperature, Map<String, Double> humidity, Map<String,Double> thresholds) {
            int otherValue = 0;
            double tempAvg = temperature.values().stream().mapToDouble(Double::doubleValue).average().orElse(otherValue);
            double humAvg = humidity.values().stream().mapToDouble(Double::doubleValue).average().orElse(otherValue);

            if(tempAvg > thresholds.get("Temperature")) {
                System.out.println("-> Alert: Wysoka temperatura! Średnia: " + tempAvg);
            }
            if(humAvg > thresholds.get("Humidity")) {
                System.out.println("-> Alert: Wysoka wilgotność! Średnia: " + humAvg);
            }
        }

        public abstract void sendAnalyzedData();
}

//Koniec, Tydzień 6, Wzorzec Template Method - abstrakcyjna klasa analizatora
