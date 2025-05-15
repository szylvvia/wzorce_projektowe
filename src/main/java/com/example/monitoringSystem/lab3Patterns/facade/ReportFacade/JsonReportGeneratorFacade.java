package com.example.monitoringSystem.lab3Patterns.facade.ReportFacade;

public class JsonReportGeneratorFacade implements ReportGeneratorFacade {
    @Override
    public String generateReport(String data) {
        return "Generated JSON report: " + data;
    }
}
