package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternReport;

// Test the implementation
public class BridgePatternReport {
    public static void main(String[] args) {
        // Weather station that generates a real PDF report
        ReportableMeasurementStation weatherStation = new WeatherStationWithReports(new PdfReportGenerator());
        weatherStation.measureAndReport("WeatherReport");

        // Industrial station that generates a real CSV report
        ReportableMeasurementStation industrialStation = new IndustrialStationWithReports(new CsvReportGenerator());
        industrialStation.measureAndReport("IndustrialReport");
    }
}
