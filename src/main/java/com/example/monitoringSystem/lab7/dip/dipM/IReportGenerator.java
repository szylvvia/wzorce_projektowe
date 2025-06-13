package com.example.monitoringSystem.lab7.dip.dipM;

//Tydzień 8, Zasada DIP (Dependency Inversion Principle), interfejs generatora raportów
//Abstrakcja na której opierają się moduły wysokopoziomowe zgodnie z zasadą DIP
//Pozwala na wymienne implementacje generatorów bez modyfikacji kodu klienta
public interface IReportGenerator {
    void generateReport(double result);
}
//Koniec, Tydzień 8, Zasada DIP - interfejs generatora