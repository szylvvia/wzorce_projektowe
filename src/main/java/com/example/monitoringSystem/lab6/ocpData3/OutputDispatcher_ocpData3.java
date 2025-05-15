package com.example.monitoringSystem.lab6.ocpData3;

import java.util.Map;

public class OutputDispatcher_ocpData3 {
    private static final Map<String, MeasurementOutput_ocpData3> outputs = Map.of(
            "console", new ConsoleOutput_ocpData3()
    );

    public static void dispatch(String type, String data) {
        outputs.getOrDefault(type, new ConsoleOutput_ocpData3()).output(data);
    }
}
