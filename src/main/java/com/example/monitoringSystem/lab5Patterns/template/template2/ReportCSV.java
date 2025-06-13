//Tydzień 6, Wzorzec Template Method - konkretna implementacja raportu CSV
//Implementuje specyficzne kroki algorytmu dla generowania raportów w formacie CSV
//Dziedziczy szkielet algorytmu z ReportTemplate i dostosowuje go do formatu CSV
package com.example.monitoringSystem.lab5Patterns.template.template2;

import java.util.Map;

public class ReportCSV extends ReportTemplate {

    @Override
    public void prepareHeader(String title, String location) {
        System.out.println("-> " + title + ", " + location);
    }

    @Override
    public void prepareBody(Map<String, Double> data) {
        for (Map.Entry<String, Double> entry : data.entrySet()) {
            System.out.println("-> " + entry.getKey() + ": " + entry.getValue());
        }
    }

    @Override
    public void prepareFooter(String author, String date) {
        System.out.println("-> " + author + ", " + date);
    }

    @Override
    public void sendReport() {
        System.out.println("-> Raport CSV został wysłany....\n");
    }
}
//Koniec, Tydzień 6, Wzorzec Template Method - CSV
