package com.example.monitoringSystem.lab3Patterns.facade.ReportFacade;

public class ReportFacade {
    private final ReportGeneratorF pdfGenerator;
    private final ReportGeneratorF csvGenerator;
    private final ReportGeneratorF jsonGenerator;

    public ReportFacade() {
        this.pdfGenerator = new PdfReportGeneratorF();
        this.csvGenerator = new CsvReportGeneratorF();
        this.jsonGenerator = new JsonReportGeneratorF();
    }

    public String generatePdfReport(String data) {
        return pdfGenerator.generateReport(data);
    }

    public String generateCsvReport(String data) {
        return csvGenerator.generateReport(data);
    }

    public String generateJsonReport(String data) {
        return jsonGenerator.generateReport(data);
    }
}
