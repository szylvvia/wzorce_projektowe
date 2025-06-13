package com.example.monitoringSystem.lab6.ocpAbstract;

//Tydzień 7, Zasada OCP (Open/Closed Principle), interfejs definujący kontrakt dla loggerów danych
//Abstraktowy interfejs umożliwiający dodawanie nowych implementacji bez modyfikacji kodu klienta
//Podstawa dla rozszerzalnego systemu logowania w aplikacji monitoringu
public interface DataLogger {
    void log(String data);
}
//Koniec, Tydzień 7, Zasada OCP - interfejs loggera

