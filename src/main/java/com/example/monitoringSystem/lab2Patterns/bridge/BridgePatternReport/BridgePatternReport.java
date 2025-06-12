package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternReport;

// Test the implementation
//public class BridgePatternReport {
//    public static void main(String[] args) {
//        // Weather station that generates a real PDF report
//        ReportableMeasurementStation weatherStation = new WeatherStationWithReports(new PdfReportGenerator());
//        weatherStation.measureAndReport("WeatherReport");
//
//        // Industrial station that generates a real CSV report
//        ReportableMeasurementStation industrialStation = new IndustrialStationWithReports(new CsvReportGenerator());
//        industrialStation.measureAndReport("IndustrialReport");
//    }
//}



import com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternReport.exceptions.ReportGenerationException;

//Tydzień 3, Wzorzec Bridge 1
//Bridge pattern do generowania raportów - oddziela abstrakcję stacji od implementacji generatora
//Umożliwia niezależne rozszerzanie typów stacji i formatów raportów
public class BridgePatternReport {
    public static void main(String[] args) {
        try {
            ReportableMeasurementStation weatherStation = new WeatherStationWithReports(new PdfReportGenerator());
            System.out.println(weatherStation.measureAndReport("WeatherReport"));

            ReportableMeasurementStation industrialStation = new IndustrialStationWithReports(new CsvReportGenerator());
            System.out.println(industrialStation.measureAndReport("IndustrialReport"));        } catch (ReportGenerationException e) {
            System.err.println("❌ Error generating report: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
//Koniec, Tydzień 3, Wzorzec Bridge 1
