//Tydzień 8, Zasada ISP - interfejs dla logowania do chmury
//Segregacja interfejsu - specjalistyczny interfejs tylko dla operacji chmurowych
//Zgodnie z ISP - klienci implementują tylko potrzebne metody
package com.example.monitoringSystem.lab7.isp.ispK;

public interface CloudLogger {
    void logToCloud(String data);
}

//Koniec, Tydzień 8, Zasada ISP - interfejs chmury
