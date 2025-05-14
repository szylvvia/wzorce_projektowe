package com.example.monitoringSystem.lab7.dip.dipS.dip1;

public class DIPSensorDevice extends SensorDevice {

    public DIPSensorDevice(ISensor sensor) {
        super(sensor);
    }

    @Override
    public void measure(double resolution) {
        System.out.println("Pomiar z rozdzielczością: " + resolution);
        sensor.readValue();
    }

}
