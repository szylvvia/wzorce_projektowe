package com.example.monitoringSystem.lab3Patterns.flyweight.flyweight1;

import java.util.HashMap;
import java.util.Map;

public class EnvironmentalFlySensorDetails implements AbstractFlySensorDetails{
    private String sensorType;
    private String value;
    private Map<String, String> sensorDetails;

    public EnvironmentalFlySensorDetails(String sensorType, String value) {
        this.sensorType = sensorType;
        this.value = value;
    }

    public EnvironmentalFlySensorDetails(EnvironmentalFlySensorDetails environmentalFlySensorDetails) {
        this.sensorType = environmentalFlySensorDetails.sensorType;
        this.value = environmentalFlySensorDetails.value;
    }

    @Override
    public Map<String, String> getSensorDetails() {
        sensorDetails = new HashMap<String,String>();
        sensorDetails.put("Sensor type", sensorType);
        sensorDetails.put("Unit", value);
        return sensorDetails;
    }
}
