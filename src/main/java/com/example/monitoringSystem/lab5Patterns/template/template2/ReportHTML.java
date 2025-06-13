//Tydzień 6, Wzorzec Template Method - generator raportów HTML
//Konkretna implementacja generowania raportów w formacie HTML
//Implementuje metody template dla tworzenia struktury HTML
package com.example.monitoringSystem.lab5Patterns.template.template2;

import java.util.Map;

public class ReportHTML extends ReportTemplate {

    @Override
    public void prepareHeader(String title, String location) {
        System.out.println("-> <h1>" + title + " w lokalizacji " + location + "</h1>");
    }

    @Override
    public void prepareBody(Map<String, Double> data) {
        for (Map.Entry<String, Double> entry : data.entrySet()) {
            System.out.println("-> <p>" + entry.getKey() + ": " + entry.getValue()+ "</p>");
        }
    }

    @Override
    public void prepareFooter(String author, String date) {
        System.out.println("-> <footer> Wykonany przez: " + author + ", " + date+"<footer>\n");
    }

    @Override
    public void sendReport() {
        System.out.println("-> Raport HTML został wysłany....");
    }
}

//Koniec, Tydzień 6, Wzorzec Template Method - generator HTML
