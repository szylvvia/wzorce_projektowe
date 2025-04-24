package com.example.monitoringSystem.lab6.zad2_monika;

import java.util.Map;

public class d_OutputDispatcher_lab6 {
    private static final Map<String, d_MeasurementOutput_lab6> outputs = Map.of(
            "console", new d_ConsoleOutput_lab6()
    );

    public static void dispatch(String type, String data) {
        outputs.getOrDefault(type, new d_ConsoleOutput_lab6()).output(data);
    }
}
