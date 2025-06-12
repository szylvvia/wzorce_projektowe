package com.example.monitoringSystem.lab3Patterns.facade.ReportFacade;

//Tydzień 4, Wzorzec Facade, podsystem bazy danych temperatury ukryty za fasadą raportów
public class TemperatureDatabase implements DatabaseService {
    @Override
    public String getData() {
        return "Average Temperature: 18.5°C";
    }
}
//Koniec, Tydzień 4, Wzorzec Facade
