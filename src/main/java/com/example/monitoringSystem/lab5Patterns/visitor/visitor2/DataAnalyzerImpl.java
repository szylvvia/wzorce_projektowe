package com.example.monitoringSystem.lab5Patterns.visitor.visitor2;

public class DataAnalyzerImpl implements DataAnalyzeVisitor {
    @Override
    public String accept(UrbanStation cityStation) {
        StringBuilder json = new StringBuilder();
        json.append("{\n");
        json.append("  Location: ").append(cityStation.location).append("\n");
        json.append("  Measurements: {\n");
        for (String key : cityStation.data.keySet()) {
            json.append("   ").append(key).append(": ").append(cityStation.data.get(key)).append("\n");
        }
        json.append("  }\n");
        json.append("}");
        return json.toString();
    }

    @Override
    public String accept(SeaStation seaStation) {
        StringBuilder json = new StringBuilder();
        json.append("{\n");
        json.append("  Data for ").append(seaStation.name).append(" in location: ").append(seaStation.location).append("\n");
        json.append("  Measurements: {\n");
        for (String key : seaStation.measurements.keySet()) {
            json.append("    ").append(key).append(": ").append(seaStation.measurements.get(key)).append("\n");
        }
        json.append("  }\n");
        json.append("  Salinity: ").append(seaStation.salinity).append("\n");
        json.append("}");
        return json.toString();
    }
}