package com.example.monitoringSystem.lab6.ocpAbstract;

//Tydzień 7, Zasada OCP (Open/Closed Principle), konkretna implementacja loggera do bazy danych
//Nowa funkcjonalność dodana przez implementację interfejsu bez modyfikacji istniejącego kodu
//Umożliwia rozszerzenie systemu logowania o nowe sposoby zapisu danych
public class DatabaseLogger implements DataLogger {
    @Override
    public void log(String data) {
        System.out.println("Logging to database: " + data);
    }
}
//Koniec, Tydzień 7, Zasada OCP - logger bazodanowy

