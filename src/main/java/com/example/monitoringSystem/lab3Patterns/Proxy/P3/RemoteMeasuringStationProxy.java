package com.example.monitoringSystem.lab3Patterns.Proxy.P3;

//Tydzień 4, Proxy Pattern, Remote Proxy - reprezentuje zdalny obiekt lokalnie i zarządza komunikacją
public class RemoteMeasuringStationProxy implements MeasuringStationP3 {
    private RemoteMeasuringStation realStation;

    @Override
    public String fetchDataP3() {
        if (realStation == null) {
            System.out.println("Connecting to remote station...");
            realStation = new RemoteMeasuringStation();
        }
        return realStation.fetchDataP3();
    }

    public String getDataP3() {
        return fetchDataP3();
    }
}
//Koniec, Tydzień 4, Proxy Pattern
