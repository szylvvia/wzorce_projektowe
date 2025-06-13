package com.example.monitoringSystem.lab6.ocpAbstract;

//Tydzień 7, Zasada OCP (Open/Closed Principle), implementacja loggera zapisującego do pliku
//Rozszerza funkcjonalność systemu logowania bez modyfikacji istniejących klas
//Przykład jak OCP umożliwia dodawanie nowych sposobów zapisu danych
public class FileLogger implements DataLogger {
    @Override
    public void log(String data) {
        System.out.println("Logging to file: " + data);
    }
}
//Koniec, Tydzień 7, Zasada OCP - logger plikowy
