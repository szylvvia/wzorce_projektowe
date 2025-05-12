package com.example.monitoringSystem.lab7.isp.ispM.ISensorFile;

public class BasicSensor implements IReadSensor, ICalibratable, IResettable, IStatusDisplayable {

    @Override
    public double readValue() {
        System.out.println("Sensor: odczytuję wartość...");
        return 20.0;
    }

    @Override
    public void calibrate() {
        System.out.println("Sensor: kalibracja...");
    }

    @Override
    public void reset() {
        System.out.println("Sensor: reset...");
    }

    @Override
    public void displayStatus() {
        System.out.println("Sensor: status OK.");
    }
}
