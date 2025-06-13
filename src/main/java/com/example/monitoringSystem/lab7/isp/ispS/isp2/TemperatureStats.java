//Tydzień 8, Zasada ISP - interfejs dla statystyk temperatury
//Segregacja interfejsu - specjalistyczny interfejs tylko dla analiz temperaturowych
//Zgodnie z ISP - nie wymusza implementacji innych typów statystyk
package com.example.monitoringSystem.lab7.isp.ispS.isp2;

public interface TemperatureStats {
    void calculateTemperatureValue();
}

//Koniec, Tydzień 8, Zasada ISP - interfejs statystyk temperatury
