package com.example.monitoringSystem.lab7.dip.dipS.dip1;

public abstract class SensorDevice{
    protected ISensor sensor;

    public SensorDevice(ISensor sensor) {
        this.sensor = sensor;
    }

    public abstract void measure(double resolution);

}
