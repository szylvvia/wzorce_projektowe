package com.example.monitoringSystem.lab3Patterns.flyweight.flyweight1;

import java.util.Map;

public class VisibleFlySensorDetails implements AbstractFlySensorDetails {
    private String width;
    private String height;
    private Map <String, String> sensorDetails;

    public VisibleFlySensorDetails(String width, String height) {
        this.width = width;
        this.height = height;
    }

    public VisibleFlySensorDetails(VisibleFlySensorDetails visibleFlySensorDetails) {
        this.width = visibleFlySensorDetails.width;
        this.height = visibleFlySensorDetails.height;
    }

    @Override
    public Map<String, String> getSensorDetails() {
        sensorDetails.put("Width", width);
        sensorDetails.put("Height", height);
        return sensorDetails;
    }
}
