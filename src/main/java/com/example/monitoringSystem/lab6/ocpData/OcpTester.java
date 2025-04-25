package com.example.monitoringSystem.lab6.ocpData;

import java.util.List;

public class OcpTester {
    public static void main(String[] args) {

        // Typy Raportów
        ReportGenerator reportGenerator = new ReportGenerator();
        System.out.println(reportGenerator.generateReport("Environmental data", ReportFormat.CSV));
        System.out.println(reportGenerator.generateReport("Environmental data", ReportFormat.PDF));
        System.out.println(reportGenerator.generateReport("Environmental data", ReportFormat.JSON));

        // Typy Alertów
        System.out.println("=== OCP with List/Map Test ===");

        AlertServiceWithMap alertService = new AlertServiceWithMap();
        alertService.send("sms", "Temperature too high!");
        alertService.send("email", "Pressure too low!");
        alertService.send("push", "Humidity critical!");
        alertService.send("fax", "Unexpected type!");  // test unknown

        // Sprawdzanie wartości progowych

        List<SensorThreshold> data = List.of(
                new SensorThreshold("CO2", 420.0, 400.0),
                new SensorThreshold("Temperature", 22.5, 25.0),
                new SensorThreshold("UV", 6.5, 6.0)
        );

        ThresholdChecker checker = new ThresholdChecker();
        checker.checkThresholds(data);
    }
}