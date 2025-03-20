package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternReport;

// Concrete Abstraction - Weather Station with Reports
public class WeatherStationWithReports extends ReportableMeasurementStation {
    public WeatherStationWithReports(ReportGenerator reportGenerator) {
        super(reportGenerator);
    }

    @Override
    public String measureAndReport(String fileName) {
        String measurementData = "Temperature: 22°C, Humidity: 57%";
        reportGenerator.generateReport(measurementData, fileName);
        return "Weather Station Report Generated: " + fileName;
    }
}

