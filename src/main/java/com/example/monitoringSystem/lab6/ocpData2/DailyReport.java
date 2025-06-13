//Tydzień 7, Zasada OCP (Open/Closed Principle), implementacja raportu dziennego
//Rozszerza system raportowania o raporty dzienne bez modyfikacji kodu bazowego
//Demonstruje jak OCP pozwala na dodawanie nowych typów raportów
package com.example.monitoringSystem.lab6.ocpData2;

import java.util.List;
import java.util.Map;

public class DailyReport implements IReport {
    private String reportDate;

    public DailyReport(String reportDate) {
        this.reportDate = reportDate;
    }

    public Map<String, Double> getWeatherData() {
        int temperatureMultiplier = 40;
        int humidityMultiplier = 100;
        int windSpeedMultiplier = 20;

        return Map.of(
            "Temperature", Math.random() * temperatureMultiplier,
            "Humidity", Math.random() * humidityMultiplier,
            "Wind Speed", Math.random() * windSpeedMultiplier
        );
    }

    @Override
    public void generateReport() {
        System.out.println("[REPORT] Daily Report for " + reportDate);
        Map<String, Double> weatherData = getWeatherData();
        for (Map.Entry<String, Double> entry : weatherData.entrySet()) {
            System.out.println("   -> "+entry.getKey() + ": " + entry.getValue());
        }

    }
}
//Koniec, Tydzień 7, Zasada OCP - raport dzienny
