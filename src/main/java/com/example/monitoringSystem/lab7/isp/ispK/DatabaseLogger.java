//Tydzień 8, Zasada ISP - interfejs dla logowania do bazy danych
//Segregacja interfejsu - specjalistyczny interfejs tylko dla operacji bazodanowych
//Zgodnie z ISP - nie wymusza implementacji niepotrzebnych metod
package com.example.monitoringSystem.lab7.isp.ispK;

public interface DatabaseLogger {
    void logToDatabase(String data);
}

//Koniec, Tydzień 8, Zasada ISP - interfejs bazy danych
