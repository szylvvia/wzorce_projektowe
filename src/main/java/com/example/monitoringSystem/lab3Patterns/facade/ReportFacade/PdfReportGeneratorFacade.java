package com.example.monitoringSystem.lab3Patterns.facade.ReportFacade;

//Tydzień 4, Wzorzec Facade, podsystem generowania raportów PDF ukryty za fasadą
public class PdfReportGeneratorFacade implements ReportGeneratorFacade {
    @Override
    public String generateReport(String data) {
        return "Generated PDF report: " + data;
    }


}
//Koniec, Tydzień 4, Wzorzec Facade
