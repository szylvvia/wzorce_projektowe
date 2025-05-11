package com.example.monitoringSystem.lab7.isp.ispK;

import com.example.monitoringSystem.lab7.isp.ispK.TemperatureSensor;

public class BasicTemperatureSensor implements TemperatureSensor {
    @Override
    public void readTemperature() {
        System.out.println("Reading temperature from BasicTemperatureSensor");
    }
}
