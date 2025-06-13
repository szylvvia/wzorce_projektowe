package com.example.monitoringSystem.lab7.dip.dipS.dip2;

//Tydzień 8, Zasada DIP (Dependency Inversion Principle), interfejs danych raportu
//Abstrakcja definiująca kontrakt dla dostarczania danych do raportów zgodnie z DIP
//Moduły wysokopoziomowe zależą od tego interfejsu, nie od konkretnych źródeł danych
public interface IReport {
    Double getDataToReport();
}
//Koniec, Tydzień 8, Zasada DIP - interfejs raportu
