package com.example.monitoringSystem.lab3Patterns.facade.ReportFacade;

public class CsvReportGeneratorFacade implements ReportGeneratorFacade {
    @Override
    public String generateReport(String data) {
        return "Generated CSV report: " + data;
    }
}
