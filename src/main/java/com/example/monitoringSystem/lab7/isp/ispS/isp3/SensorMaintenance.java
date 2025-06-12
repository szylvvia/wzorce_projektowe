package com.example.monitoringSystem.lab7.isp.ispS.isp3;

//Tydzień 8, Zasada ISP (Interface Segregation Principle), segregowany interfejs tylko dla operacji konserwacyjnych
public interface SensorMaintenance {
    void turnOn();
    void turnOff();
    void calibrate();
}
//Koniec, Tydzień 8, Zasada ISP
