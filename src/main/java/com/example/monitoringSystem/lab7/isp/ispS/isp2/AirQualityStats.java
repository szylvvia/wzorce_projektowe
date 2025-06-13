//Tydzień 8, Zasada ISP - interfejs dla statystyk jakości powietrza
//Segregacja interfejsu - specjalistyczny interfejs tylko dla analiz powietrza
//Zgodnie z ISP - nie wymusza implementacji temperatury czy hałasu
package com.example.monitoringSystem.lab7.isp.ispS.isp2;

public interface AirQualityStats {
    void calculateAirQualityValue();
}

//Koniec, Tydzień 8, Zasada ISP - interfejs statystyk powietrza
