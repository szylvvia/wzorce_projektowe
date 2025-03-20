package com.example.monitoringSystem.lab2Patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class MonitoringStationC implements SensorC {

    private String name;
    private List<SensorC> sensors = new ArrayList<>();

    public MonitoringStationC(String name, List<SensorC> sensors) {
        this.name = name;
        this.sensors = sensors;
    }

    private void addComponent(SensorC sensor){
        this.sensors.add(sensor);
    }

    private void removeComponent(SensorC sensor){
        this.sensors.remove(sensor);
    }

    @Override
    public String getDetails() {
        StringBuilder details = new StringBuilder("Stacja monitorująca: " + name + "\n");
        for (SensorC sensor : sensors){
            details.append(sensor.getDetails()).append("\n");
        }
        return details.toString();
    }

    @Override
    public void showMeasurement() {
        for (SensorC sensor : sensors){
            sensor.showMeasurement();
        }
    }

    @Override
    public void reset() {
        for (SensorC sensor : sensors){
            sensor.reset();
        }
    }
}
