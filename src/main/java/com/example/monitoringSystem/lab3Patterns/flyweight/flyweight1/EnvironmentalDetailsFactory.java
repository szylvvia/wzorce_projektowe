package com.example.monitoringSystem.lab3Patterns.flyweight.flyweight1;

import java.util.HashMap;

public class EnvironmentalDetailsFactory {
    private static final HashMap<SensorType, AbstractFlySensorDetails> sensorDetails = new HashMap<SensorType, AbstractFlySensorDetails>();

    public static EnvironmentalFlySensorDetails getEnvironmentalFlySensorDetails(SensorType sensorType) {
        EnvironmentalFlySensorDetails environmentalImpl = (EnvironmentalFlySensorDetails) sensorDetails.get(sensorType);
        if (environmentalImpl == null) {
            if (sensorType == SensorType.TEMPERATURE) {
                environmentalImpl = new EnvironmentalFlySensorDetails("Temperature", "Celsius");
            } else if (sensorType == SensorType.HUMIDITY) {
                environmentalImpl = new EnvironmentalFlySensorDetails("Humidity", "Percentage");
            } else if (sensorType == SensorType.PRESSURE) {
                environmentalImpl = new EnvironmentalFlySensorDetails("Pressure", "Pascal");
            }
            sensorDetails.put(sensorType, environmentalImpl);
        }
        return environmentalImpl;
    }
    public static enum SensorType {
        TEMPERATURE, HUMIDITY, PRESSURE
    }
}

