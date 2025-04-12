package com.example.monitoringSystem.lab5Patterns.template.template2;

import java.util.Map;

public class ReportPatternTester {
    public static void main(String[] args) {

        String type1 = "Raport środowiskowy";
        String location1 = "Warszawa";
        Map<String, Double> data1 = Map.of("Temperatura", 25.0, "Wilgotność", 60.0, "Ciśnienie", 1013.0);
        String author1 = "Jan Kowalski";
        String date1 = "2023-10-01";
        String fileName1 = "raport.pdf";

        ReportTemplate reportPDF = new ReportPDF();
        reportPDF.generateReport(type1, location1, data1, author1, date1, fileName1);

        String type2 = "Raport środowiskowy tygodniowy";
        String location2 = "Gdynia";
        Map<String, Double> data2 = Map.of("Temperatura", 12.0, "Wilgotność", 66.0, "Ciśnienie", 980.0);
        String author2 = "Anna Nowak";
        String date2 = "2023-11-11";
        String fileName2 = "raport_tygodniowy.csv";

        ReportTemplate reportHTML = new ReportHTML();
        reportHTML.generateReport(type2, location2, data2, author2, date2, fileName2);

        String type3 = "Raport środowiskowy testowy";
        String location3 = "Krakow";
        Map<String, Double> data3 = Map.of("Temperatura", 16.0, "Wilgotność", 80.0, "Ciśnienie", 1015.0);
        String author3 = "Jan Nowakowski";
        String date3 = "2023-11-05";
        String fileName3 = "raport_testowy.html";

        ReportTemplate reportCSV = new ReportCSV();
        reportCSV.generateReport(type3, location3, data3, author3, date3, fileName3);
    }
}
