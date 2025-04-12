package com.example.monitoringSystem.lab5Patterns.visitor.visitor2;

import java.util.HashMap;
import java.util.Map;

public class UrbanStation implements DataAnalyzeVisitable {
    String location;
    Map<String, Double> data = new HashMap<>();

    public UrbanStation(String location, Map<String, Double> data) {
        this.location = location;
        this.data = data;
    }

    public String getAllData() {
        StringBuilder allData = new StringBuilder();
        allData.append("Location: ").append(location).append("\n");
        for (Map.Entry<String, Double> entry : data.entrySet()) {
            allData.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return allData.toString();
    }

    @Override
    public String accept(DataAnalyzeVisitor dataAnalyzer) {
        return dataAnalyzer.accept(this);
    }
}
