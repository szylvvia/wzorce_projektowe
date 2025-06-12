package com.example.monitoringSystem.lab7.dip.dipS.dip1;

//Tydzień 8, Zasada DIP (Dependency Inversion Principle), wysokopoziomowy moduł zależny od abstrakcji ISensor
public abstract class SensorDevice{
    protected ISensor sensor;

    public SensorDevice(ISensor sensor) {
        this.sensor = sensor;
    }

    public abstract void measure(double resolution);

}
//Koniec, Tydzień 8, Zasada DIP
