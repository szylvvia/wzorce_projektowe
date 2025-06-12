package com.example.monitoringSystem.lab1Patterns.factory;

//Tydzień 2, Implementacja raportu JSON dla wzorca Factory
//Konkrety produkt generujący raporty w formacie JSON
//Część rodziny raportów tworzonych przez ReportTypeFactory
public class JsonReport implements Report {
    @Override
    public String getFormat() {
        return "JSON";
    }
}
//Koniec, Tydzień 2, Implementacja raportu JSON
