package com.example.monitoringSystem.lab5Patterns.template.template2;

import java.util.Map;

public class ReportPatternTester {
    public static void main(String[] args) {

        Map<String, Double> data1 = Map.of("Temperatura", 25.0, "Wilgotność", 60.0, "Ciśnienie", 1013.0);
        Map<String, String> reportDetails1 = Map.of(
                "type", "Raport środowiskowy",
                "location", "Warszawa",
                "author", "Jan Kowalski",
                "date", "2023-10-01"
        );

        ReportTemplate reportPDF = new ReportPDF();
        reportPDF.generateReport(reportDetails1, data1);

        Map<String, String>reportDetails2 = Map.of(
                "type", "Raport środowiskowy",
                "location", "Gdańsk",
                "author", "Anna Nowak",
                "date", "2023-10-15"
        );
        Map<String, Double> data2 = Map.of("Temperatura", 20.0, "Wilgotność", 70.0, "Ciśnienie", 1010.0);

        ReportTemplate reportHTML = new ReportHTML();
        reportHTML.generateReport(reportDetails2, data2);

        Map<String, String> reportDetails3 = Map.of(
                "type", "Raport CSV",
                "location", "Kraków",
                "author", "Piotr Wiśniewski",
                "date", "2023-10-20"
        );

        Map<String, Double> data3 = Map.of("Temperatura", 22.0, "Wilgotność", 65.0, "Ciśnienie", 1012.0);

        ReportTemplate reportCSV = new ReportCSV();
        reportCSV.generateReport(reportDetails3, data3);
    }
}
