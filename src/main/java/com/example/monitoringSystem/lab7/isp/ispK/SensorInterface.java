//Tydzień 8, Zasada ISP - naruszenie ISP przez monolityczny interfejs sensorów
//Przykład złego projektowania - wymusza implementację wszystkich typów pomiarów
//Klienci muszą implementować temperaturę, wilgotność i ciśnienie nawet jeśli używają tylko jednego
package com.example.monitoringSystem.lab7.isp.ispK;

public interface SensorInterface {
    void readTemperature();
    void readHumidity();
    void readPressure();
}

//Koniec, Tydzień 8, Zasada ISP - naruszenie przez monolityczny sensor
