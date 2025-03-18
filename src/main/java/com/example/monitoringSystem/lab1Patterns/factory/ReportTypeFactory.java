package com.example.monitoringSystem.lab1Patterns.factory;

public class ReportTypeFactory {
    public static Report createReport(String type) {
        switch(type) {
            case "PDF":
                return new PdfReport();
            case "JSON":
                return new JsonReport();
            case "Excel":
                return new ExcelReport();
            default:
                throw new IllegalArgumentException("Nieznany typ raportu");
        }
    }
}
