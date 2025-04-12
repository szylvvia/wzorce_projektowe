package com.example.monitoringSystem.lab5Patterns.visitor.visitor2;

import java.util.HashMap;
import java.util.Map;

public class SeaStation implements DataAnalyzeVisitable {
    String name;
    String location;
    String salinity;
    Map<String, Double> measurements = new HashMap<>();

    public SeaStation(String name, String location, String salinity, Map<String, Double> measurements) {
        this.name = name;
        this.location = location;
        this.salinity = salinity;
        this.measurements = measurements;
    }

    public String getAllData() {
        StringBuilder allData = new StringBuilder();
        allData.append("Location: ").append(location).append("\n");
        for (Map.Entry<String, Double> entry : measurements.entrySet()) {
            allData.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        allData.append("Salinity: ").append(salinity).append("\n");
        return allData.toString();
    }
    @Override
    public String accept(DataAnalyzeVisitor dataAnalyzer) {
        return dataAnalyzer.accept(this);
    }
}
