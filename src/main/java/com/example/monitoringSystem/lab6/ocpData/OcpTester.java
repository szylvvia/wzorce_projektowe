//Tydzień 7, Zasada OCP (Open/Closed Principle), tester różnych implementacji OCP
//Demonstruje zastosowanie zasady OCP w systemie raportowania i alertów
//Pokazuje jak system jest otwarty na rozszerzenia ale zamknięty na modyfikacje
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

        double currentCO2 = 420.0;
        double currentTemperature = 22.5;
        double currentUV = 6.5;
        double thresholdCO2 = 400.0;
        double thresholdTemperature = 25.0;
        double thresholdUV = 6.0;

        List<SensorThreshold> data = List.of(
                new SensorThreshold("CO2", currentCO2, thresholdCO2),
                new SensorThreshold("Temperature", currentTemperature, thresholdTemperature),
                new SensorThreshold("UV", currentUV, thresholdUV)
        );

        ThresholdChecker checker = new ThresholdChecker();
        checker.checkThresholds(data);
    }
}
//Koniec, Tydzień 7, Zasada OCP - tester