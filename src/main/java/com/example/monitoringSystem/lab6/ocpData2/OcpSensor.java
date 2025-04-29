package com.example.monitoringSystem.lab6.ocpData2;

import java.util.List;

public class OcpSensor {
    public void readMeasurementFromAllSensors(List<ISensor> sensors) {
        for (ISensor sensor : sensors) {
            sensor.readMeasurement();
        }
    }
}
