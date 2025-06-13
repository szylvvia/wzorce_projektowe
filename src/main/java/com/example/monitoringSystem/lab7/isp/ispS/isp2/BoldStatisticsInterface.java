//Tydzień 8, Zasada ISP - naruszenie ISP przez monolityczny interfejs statystyk
//Przykład złego projektowania - wymusza implementację wszystkich typów statystyk
//Klienci muszą implementować temperaturę, hałas i jakość powietrza nawet jeśli używają tylko jednego
package com.example.monitoringSystem.lab7.isp.ispS.isp2;

public interface BoldStatisticsInterface {
    void calculateAirQualityValue();
    void calculateTemperatureValue();
    void calculateNoiseValue();
}

//Koniec, Tydzień 8, Zasada ISP - naruszenie przez monolityczne statystyki
