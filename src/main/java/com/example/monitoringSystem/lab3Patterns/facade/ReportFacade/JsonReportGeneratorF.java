package com.example.monitoringSystem.lab3Patterns.facade.ReportFacade;

public class JsonReportGeneratorF implements ReportGeneratorF {
    @Override
    public String generateReport(String data) {
        return "Generated JSON report: " + data;
    }
}
