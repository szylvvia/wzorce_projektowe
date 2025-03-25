package com.example.monitoringSystem.lab3Patterns.facade.ReportFacade;

public class CsvReportGeneratorF implements ReportGeneratorF {
    @Override
    public String generateReport(String data) {
        return "Generated CSV report: " + data;
    }
}
