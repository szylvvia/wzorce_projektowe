package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter1;

import java.util.List;
import java.util.Map;

public class Context {
    private Map<String, List<Double>> data;

    public Context(Map<String, List<Double>> data) {
        this.data = data;
    }

    public List<Double> getContext(String name) {
        return data.get(name);
    }

    public void addContext(String name, List<Double> value) {
        data.put(name, value);
    }

}
