//Tydzień 8, Zasada ISP (Interface Segregation Principle) - interfejs dla logowania do pliku
//Segregacja interfejsu - klienci implementują tylko potrzebne funkcjonalności
//Oddzielny interfejs dla operacji zapisu do pliku bez wymuszania innych metod
package com.example.monitoringSystem.lab7.isp.ispK;

public interface FileLogger {
    void logToFile(String data);
}

//Koniec, Tydzień 8, Zasada ISP - interfejs pliku
