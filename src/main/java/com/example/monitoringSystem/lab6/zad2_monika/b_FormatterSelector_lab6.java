package com.example.monitoringSystem.lab6.zad2_monika;

import java.util.Map;

public class b_FormatterSelector_lab6 {
    private static final Map<String, b_MeasurementFormatter_lab6> formatterMap = Map.of(
            "json", new b_JsonFormatter_lab6()
    );

    public static b_MeasurementFormatter_lab6 get(String type) {
        return formatterMap.getOrDefault(type, new b_JsonFormatter_lab6());
    }
}
