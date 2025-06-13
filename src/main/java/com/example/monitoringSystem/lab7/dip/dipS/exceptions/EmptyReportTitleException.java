package com.example.monitoringSystem.lab7.dip.dipS.exceptions;

//Tydzień 9, Wyjątek dla pustego tytułu raportu
//Niestandardowy wyjątek rzucany gdy tytuł raportu jest pusty lub null
//Rozszerza RuntimeException dla obsługi błędów walidacji danych wejściowych
public class EmptyReportTitleException extends RuntimeException {
    public EmptyReportTitleException(String message) {
        super(message);
    }
}
//Koniec, Tydzień 9, Wyjątek pustego tytułu