package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternReport;

// Concrete Abstraction - Industrial Station with Reports
public class IndustrialStationWithReports extends ReportableMeasurementStation {
    public IndustrialStationWithReports(ReportGenerator reportGenerator) {
        super(reportGenerator);
    }

    @Override
    public String measureAndReport(String fileName) {
        String measurementData = "CO2 Levels: 400ppm, Noise: 70dB";
        reportGenerator.generateReport(measurementData, fileName);
        return "Industrial Station Report Generated: " + fileName;
    }
}

