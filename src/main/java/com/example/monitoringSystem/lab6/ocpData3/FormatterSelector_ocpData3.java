package com.example.monitoringSystem.lab6.ocpData3;

import java.util.Map;

public class FormatterSelector_ocpData3 {
    private static final Map<String, MeasurementFormatter_ocpData3> formatterMap = Map.of(
            "json", new JsonFormatter_ocpData3()
    );

    public static MeasurementFormatter_ocpData3 get(String type) {
        return formatterMap.getOrDefault(type, new JsonFormatter_ocpData3());
    }
}
