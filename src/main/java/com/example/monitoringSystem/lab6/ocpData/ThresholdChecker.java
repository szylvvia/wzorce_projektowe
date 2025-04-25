package com.example.monitoringSystem.lab6.ocpData;

import java.util.List;

public class ThresholdChecker {
    public void checkThresholds(List<SensorThreshold> thresholds) {
        for (SensorThreshold threshold : thresholds) {
            if (threshold.getCurrentValue() > threshold.getLimit()) {
                System.out.println("ALERT: " + threshold.getSensorType() + " exceeds limit!");
            } else {
                System.out.println(threshold.getSensorType() + " is normal.");
            }
        }
    }
}
