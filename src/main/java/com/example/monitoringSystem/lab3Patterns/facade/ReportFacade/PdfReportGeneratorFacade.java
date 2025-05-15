package com.example.monitoringSystem.lab3Patterns.facade.ReportFacade;

public class PdfReportGeneratorFacade implements ReportGeneratorFacade {
    @Override
    public String generateReport(String data) {
        return "Generated PDF report: " + data;
    }


}
