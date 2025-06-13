package com.example.monitoringSystem.lab3Patterns.Proxy.P1;

//Tydzień 4, Proxy Pattern, Virtual Proxy - opóźnia tworzenie kosztownego obiektu do momentu rzeczywistego użycia
public class VirtualMeasuringStationProxy implements MeasuringStationP1 {
    private RealMeasuringStation realStation;

    @Override
    public void displayDataP1() {
        getDataP1(); // This still prints to console
    }

    public String getDataP1() {
        if (realStation == null) {
            realStation = new RealMeasuringStation();
        }
        return realStation.getDataP1();
    }
}
//Koniec, Tydzień 4, Proxy Pattern
