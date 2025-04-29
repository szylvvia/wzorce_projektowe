package com.example.monitoringSystem.lab6.ocpData2;

import java.util.List;

public class OcpDataTester {
    public static void main(String[] args) {

        List<ICity> cities = List.of(
           new CapitalCity("Warszawa"),
           new CapitalCity("Budapest"),
           new AglomerationCity("Trojmiasto"),
           new AglomerationCity("Kraków"),
           new CapitalCity("Praga")
        );

        for (ICity city : cities) {
            city.checkWeather();
        }

        System.out.println("-------------------------------------------------");

        List<ISensor> sensors = List.of(
            new GrassPollenSensor("W-001"),
            new AirQualitySensor("T-112"),
            new GrassPollenSensor("B-009"),
            new AirQualitySensor("K-002"),
            new GrassPollenSensor("P-542")
        );

        for (ISensor sensor : sensors) {
            sensor.readMeasurement();
        }

        System.out.println("-------------------------------------------------");

        List<IReport> reports = List.of(new DailyReport("2023-10-01"),
                new DailyReport("2023-10-02"),
                new DailyReport("2023-10-03"),
                new MonthlyReport("2023-10"),
                new MonthlyReport("2023-11"),
                new DailyReport("2023-10-04")
        );

        for (IReport report : reports) {
            report.generateReport();
        }
    }
}
