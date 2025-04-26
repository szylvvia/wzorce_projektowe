package com.example.monitoringSystem.lab6.ocpAbstract2;

import java.util.List;

public class OcpSensor {
    public void measureAllSensors(List<ASensor> sensorList) {
        for (ASensor sensor : sensorList) {
            sensor.measure();
        }
    }
    public void showAllMeasurements(List<ASensor> sensorList) {
        for (ASensor sensor : sensorList) {
            sensor.calibrate();
        }
    }
}
