package com.example.monitoringSystem.lab1Patterns.factory;

//Tydzień 2, Implementacja raportu Excel dla wzorca Factory
//Konkretny produkt fabryki dla generowania raportów Excel
//Rozszerza możliwości systemu o format Excel
public class ExcelReport implements Report {
    @Override
    public String getFormat() {
        return "Excel";
    }
}
//Koniec, Tydzień 2, Implementacja raportu Excel
