package com.example.monitoringSystem.lab7.isp.ispS.isp3;

//Tydzień 8, Zasada ISP (Interface Segregation Principle), naruszenie ISP - zbyt szeroki interfejs wymuszający implementację niepotrzebnych metod
public interface EnvironmentalStation {
    void turnOn();
    void turnOff();
    void calibrate();
    void monitorAirPollution();
    void monitorWaterQuality();
    void monitorSoilHumidity();

}
//Koniec, Tydzień 8, Zasada ISP
