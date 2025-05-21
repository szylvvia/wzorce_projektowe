package com.example.monitoringSystem.lab7.dip.dipS.dip1;

import com.example.monitoringSystem.lab7.dip.dipS.exceptions.NegativeResolutionException;

public class DIPSensorDevice extends SensorDevice {

    public DIPSensorDevice(ISensor sensor) {
        super(sensor);
    }

    @Override
    public void measure(double resolution) {
        if (resolution <= 0) {
            throw new NegativeResolutionException("Rozdzielczość nie może być ujemna");
        }
        System.out.println("Pomiar z rozdzielczością: " + resolution);
        sensor.readValue();
    }

}
