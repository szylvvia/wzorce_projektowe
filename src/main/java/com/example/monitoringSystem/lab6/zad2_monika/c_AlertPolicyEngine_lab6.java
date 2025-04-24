package com.example.monitoringSystem.lab6.zad2_monika;

import java.util.Map;

public class c_AlertPolicyEngine_lab6 {
    private static final Map<String, Double> limits = Map.of(
            "temperature", 23.0
    );

    public static boolean check(String type, a_Measurement_lab6m m) {
        if ("temperature".equals(type)) {
            return m.temperature > limits.get("temperature");
        }
        return false;
    }
}
