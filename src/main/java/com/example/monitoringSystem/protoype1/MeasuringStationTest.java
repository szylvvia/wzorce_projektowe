package com.example.monitoringSystem.protoype1;

public class MeasuringStationTest {

    public static void main(String[] args) {
        MeasuringStation prototypeStation = new MeasuringStation("Station A", "New York");

        MeasuringStation clonedStation = prototypeStation.clone();
        clonedStation.setName("Station B");
        clonedStation.setLocalization("New York");

        System.out.println(prototypeStation);
        System.out.println(clonedStation);
    }
}
