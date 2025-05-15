package com.example.monitoringSystem.lab2Patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class MonitoringStationComposite implements SensorComposite {

    private String name;
    private List<SensorComposite> sensors = new ArrayList<>();

    public MonitoringStationComposite(String name, List<SensorComposite> sensors) {
        this.name = name;
        this.sensors = sensors;
    }

    private void addComponent(SensorComposite sensor){
        this.sensors.add(sensor);
    }

    private void removeComponent(SensorComposite sensor){
        this.sensors.remove(sensor);
    }

    @Override
    public String getDetails() {
        StringBuilder details = new StringBuilder("Stacja monitorująca: " + name + "\n");
        for (SensorComposite sensor : sensors){
            details.append(sensor.getDetails()).append("\n");
        }
        return details.toString();
    }

    @Override
    public void showMeasurement() {
        for (SensorComposite sensor : sensors){
            sensor.showMeasurement();
        }
    }

    @Override
    public void reset() {
        for (SensorComposite sensor : sensors){
            sensor.reset();
        }
    }
}
