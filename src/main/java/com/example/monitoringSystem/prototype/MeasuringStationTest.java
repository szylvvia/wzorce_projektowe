package com.example.monitoringSystem.prototype;

public class MeasuringStationTest {

    public static void main(String[] args) {
        MeasuringStationP prototypeStation = new MeasuringStationP("Station A", "New York");

        MeasuringStationP clonedStation = prototypeStation.clone();
        clonedStation.setName("Station B");
        clonedStation.setLocalization("New York");

        System.out.println(prototypeStation);
        System.out.println(clonedStation);
    }
}
