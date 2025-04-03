package com.example.monitoringSystem.lab4Patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AlertHistory implements Iterable<String> {
    private List<String> alerts = new ArrayList<>();

    public void addAlert(String alert) {
        alerts.add(alert);
    }

    @Override
    public Iterator<String> iterator() {
        return alerts.iterator();
    }
}

