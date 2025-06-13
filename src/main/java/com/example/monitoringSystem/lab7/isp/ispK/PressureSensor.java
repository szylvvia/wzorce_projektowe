//Tydzień 8, Zasada ISP - interfejs dla sensora ciśnienia
//Segregacja interfejsu - specjalistyczny interfejs tylko dla pomiaru ciśnienia
//Zgodnie z ISP - klienci implementują tylko potrzebne funkcjonalności pomiarowe
package com.example.monitoringSystem.lab7.isp.ispK;

public interface PressureSensor {
    void readPressure();
}

//Koniec, Tydzień 8, Zasada ISP - interfejs ciśnienia
