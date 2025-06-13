//Tydzień 8, Zasada DIP (Dependency Inversion Principle), abstrakcyjny generator raportów
//Wysokopoziomowy moduł zależny od abstrakcji IReport zgodnie z zasadą DIP
//Wstrzykiwanie zależności przez konstruktor zapewnia elastyczność i odwrócenie kontroli
package com.example.monitoringSystem.lab7.dip.dipS.dip2;

public abstract class ReportGenerator {
    protected IReport report;

    public ReportGenerator(IReport report) {
        this.report = report;
    }

    public abstract void generateReport(String title, String date);
}
//Koniec, Tydzień 8, Zasada DIP - abstrakcyjny generator
