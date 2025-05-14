package com.example.monitoringSystem.lab7.isp.ispS.isp3;

import java.util.ArrayList;
import java.util.List;

public class AdvancedWaterStation implements WaterStation, SensorMaintenance{
    @Override
    public void monitorWaterQuality() {
        List<String> waterQualityData = List.of("pH: 7.0", "Turbidity: 5 NTU", "Dissolved Oxygen: 8 mg/L");
        String randomData = waterQualityData.get((int) (Math.random() * waterQualityData.size()));
        System.out.println("Monitoring water quality... | Water quality data: " + randomData);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on the water station...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the water station...");
    }

    @Override
    public void calibrate() {
        System.out.println("Calibrating the water station...");
    }
}
