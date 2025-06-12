//Tydzień 3, Bridge Pattern - konkretna abstrakcja stacji pogodowej z raportami
package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternReport;

import com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternReport.exceptions.ReportGenerationException;

// Concrete Abstraction - Weather Station with Reports
public class WeatherStationWithReports extends ReportableMeasurementStation {
    public WeatherStationWithReports(ReportGenerator reportGenerator) {
        super(reportGenerator);
    }

    @Override
    public String measureAndReport(String fileName) throws ReportGenerationException {
        String measurementData = "Temperature: 22°C, Humidity: 57%";
        reportGenerator.generateReport(measurementData, fileName);
        return "Weather Station Report Generated: " + fileName;
    }

}
//Koniec, Tydzień 3, Bridge Pattern

