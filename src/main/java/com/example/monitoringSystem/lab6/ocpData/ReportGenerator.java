//Tydzień 7, Zasada OCP (Open/Closed Principle), generator raportów z switch expression
//Wykorzystuje nowoczesną składnię Java do generowania raportów w różnych formatach
//Może być rozszerzony o nowe formaty zgodnie z zasadą OCP
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
//Koniec, Tydzień 7, Zasada OCP - generator raportów
