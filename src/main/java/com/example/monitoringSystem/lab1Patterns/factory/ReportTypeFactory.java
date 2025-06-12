package com.example.monitoringSystem.lab1Patterns.factory;

//Tydzień 2, Wzorzec Factory 2
//Factory do tworzenia różnych typów raportów (PDF, JSON, Excel)
//Enkapsuluje logikę tworzenia obiektów na podstawie przekazanego typu
public class ReportTypeFactory {
    public static Report createReport(String type) {
        switch(type) {
            case "PDF":
                return new PdfReport();
            case "JSON":
                return new JsonReport();
            case "Excel":
                return new ExcelReport();
            default:                throw new IllegalArgumentException("Nieznany typ raportu");
        }
    }
}
//Koniec, Tydzień 2, Wzorzec Factory 2
