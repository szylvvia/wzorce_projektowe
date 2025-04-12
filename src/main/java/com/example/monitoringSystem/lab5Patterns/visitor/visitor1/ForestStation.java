package com.example.monitoringSystem.lab5Patterns.visitor.visitor1;

public class ForestStation implements StationVisitable {

    private String[][] data;

    private final int id = 0;
    private final int type = 1;
    private final int val = 2;

    public ForestStation(String[][] data) {
        this.data = data;
    }

    public String getAllData() {
        StringBuilder allData = new StringBuilder();
        for (String[] record : data) {
            allData.append("Type: ").append(record[type]).append(", Value: ").append(record[val]).append("\n");
        }
        return allData.toString();
    }

    public int getDataSize() {
        return data.length;
    }

    public String getTypeById(int id) {
        for (String[] record : data) {
            if (Integer.parseInt(record[this.id]) == id) {
                return record[type];
            }
        }
        return null;
    }

    public String getValById(int id) {
        for (String[] record : data) {
            if (Integer.parseInt(record[this.id]) == id) {
                return record[val];
            }
        }
        return null;
    }

    @Override
    public String accept(StationVisitor visitor) {
        return visitor.visit(this);
    }
}
