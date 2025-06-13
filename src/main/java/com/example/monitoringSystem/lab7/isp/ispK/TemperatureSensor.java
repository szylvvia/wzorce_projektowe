//Tydzień 8, Zasada ISP - interfejs dla sensora temperatury
//Segregacja interfejsu - specjalistyczny interfejs tylko dla pomiaru temperatury
//Zgodnie z ISP - nie wymusza implementacji innych typów sensorów
package com.example.monitoringSystem.lab7.isp.ispK;

public interface TemperatureSensor {
    void readTemperature();
}

//Koniec, Tydzień 8, Zasada ISP - interfejs temperatury
