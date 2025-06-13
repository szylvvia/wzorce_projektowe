//Tydzień 8, Zasada ISP - naruszenie ISP przez monolityczny interfejs loggera
//Przykład złego projektowania - wymusza implementację wszystkich metod logowania
//Klienci muszą implementować bazy danych, pliki i chmurę nawet jeśli używają tylko jednej
package com.example.monitoringSystem.lab7.isp.ispK;

public interface DataLoggerInterface {
    void logToDatabase(String data);
    void logToFile(String data);
    void logToCloud(String data);
}

//Koniec, Tydzień 8, Zasada ISP - naruszenie przez monolityczny logger
