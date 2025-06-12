package com.example.monitoringSystem.lab1Patterns.factory;

//Tydzień 2, Implementacja raportu PDF dla wzorca Factory
//Konkretny produkt fabryki ReportTypeFactory
//Generuje raporty w formacie PDF
public class PdfReport implements Report {
    @Override
    public String getFormat() {
        return "PDF";
    }
}
//Koniec, Tydzień 2, Implementacja raportu PDF
