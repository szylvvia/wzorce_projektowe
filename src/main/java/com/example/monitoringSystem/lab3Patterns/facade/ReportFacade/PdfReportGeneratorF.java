package com.example.monitoringSystem.lab3Patterns.facade.ReportFacade;

public class PdfReportGeneratorF implements ReportGeneratorF {
    @Override
    public String generateReport(String data) {
        return "Generated PDF report: " + data;
    }


}
