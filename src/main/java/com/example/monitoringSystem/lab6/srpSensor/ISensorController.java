package com.example.monitoringSystem.lab6.srpSensor;

//Tydzień 7, Zasada SRP (Single Responsibility Principle), interfejs odpowiedzialny tylko za kontrolę czujnika
public interface ISensorController {
    void turnOn();
    void turnOff();
    void reset();
}
//Koniec, Tydzień 7, Zasada SRP
