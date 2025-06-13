package com.example.monitoringSystem.lab3Patterns.flyweight.flyweight2;

import java.util.HashMap;
import java.util.Map;

//Tydzień 4, Flyweight Pattern, Konkretny flyweight przechowujący powtarzalne dane raportów
public class RepeatFlyReportData implements AbstractFlyReportDetails {
    private String reportType;
    private String reportContent;
    private Map<String, String> reportDetails;

    public RepeatFlyReportData(String reportType, String reportContent) {
        this.reportType = reportType;
        this.reportContent = reportContent;
    }

    @Override
    public Map<String, String> getReportDetails() {
        reportDetails = new HashMap<String,String>() {};
        reportDetails.put("Report type", reportType);
        reportDetails.put("Content", reportContent);
        return reportDetails;
    }
}
//Koniec, Tydzień 4, Flyweight Pattern
