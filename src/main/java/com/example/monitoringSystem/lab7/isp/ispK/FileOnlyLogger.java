//Tydzień 8, Zasada ISP - implementacja logowania tylko do pliku
//Implementuje wyłącznie funkcjonalność zapisu do pliku zgodnie z ISP
//Nie jest obciążona niepotrzebnymi metodami z innych interfejsów
package com.example.monitoringSystem.lab7.isp.ispK;

public class FileOnlyLogger implements FileLogger {
    @Override
    public void logToFile(String data) {
        System.out.println("Logging to file: " + data);
    }
}
//Koniec, Tydzień 8, Zasada ISP - implementacja pliku
