package com.example.monitoringSystem.lab6.ocpData2;

import java.util.List;
import java.util.Map;

public class DailyReport implements IReport {
    private String reportDate;

    public DailyReport(String reportDate) {
        this.reportDate = reportDate;
    }

    public Map<String, Double> getWeatherData() {
        // Simulate fetching weather data
        return Map.of(
                "Temperature", Math.random() * 40,
                "Humidity", Math.random() * 100,
                "Wind Speed", Math.random() * 20
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
