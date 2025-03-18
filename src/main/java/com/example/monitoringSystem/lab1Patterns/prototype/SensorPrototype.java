package com.example.monitoringSystem.lab1Patterns.prototype;

public class SensorPrototype implements Cloneable {
    private final String type;
    private final String description;

    public SensorPrototype(String type, String description) {
        this.type = type;
        this.description = description;
    }

    @Override
    public Object clone() {
        try {
            return (SensorPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "SensorPrototype: " + type + " - " + description;
    }
}
