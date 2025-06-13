//Tydzień 4, Wzorzec Facade - interfejs usługi bazy danych
//Definiuje kontrakt dla różnych źródeł danych w systemie raportowania
//Część podsystemu bazy danych ukrywanego przez fasadę ReportFacade
package com.example.monitoringSystem.lab3Patterns.facade.ReportFacade;

public interface DatabaseService {
    String getData();
}
//Koniec, Tydzień 4, Wzorzec Facade - interfejs DB
