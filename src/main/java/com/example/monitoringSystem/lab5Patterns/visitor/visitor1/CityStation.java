package com.example.monitoringSystem.lab5Patterns.visitor.visitor1;

public class CityStation implements StationVisitable {

    private String[][] data;

    private final int name = 1;
    private final int population = 2;
    private final int surface = 3;
    private final int airCondition = 4;

    public CityStation(String[][] data) {
        this.data = data;
    }

    public String getAllData() {
        StringBuilder allData = new StringBuilder();
        for (String[] record : data) {
            allData.append("Name: ").append(record[name]).append(", Population: ").append(record[population])
                    .append(", Surface: ").append(record[surface]).append(", Air Condition: ").append(record[airCondition])
                    .append("\n");
        }
        return allData.toString();
    }

    public int getDataSize() {
        return data.length;
    }

    public String getNameById(int id) {
        return data[id][name];
    }

    public String getPopulationById(int id) {
        return data[id][population];
    }

    public String getSurfaceById(int id) {
        return data[id][surface];
    }

    public String getAirConditionById(int id) {
        return data[id][airCondition];
    }

    @Override
    public String accept(StationVisitor visitor) {
        return visitor.visit(this);
    }
}
