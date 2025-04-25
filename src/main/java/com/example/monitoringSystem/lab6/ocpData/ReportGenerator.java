package com.example.monitoringSystem.lab6.ocpData;

public class ReportGenerator {
    public String generateReport(String content, ReportFormat format) {
        return switch (format) {
            case PDF -> "PDF Report: " + content;
            case CSV -> "CSV Report: " + content;
            case JSON -> "JSON Report: " + content;
        };
    }
}
