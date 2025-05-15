package com.example.monitoringSystem.lab6.ocpData3;

import java.util.Map;

public class AlertPolicyEngine_ocpData3 {
    private static final Map<String, Double> limits = Map.of(
            "temperature", 23.0
    );

    public static boolean check(String type, Measurement_ocpData3 m) {
        if ("temperature".equals(type)) {
            return m.temperature > limits.get("temperature");
        }
        return false;
    }
}
