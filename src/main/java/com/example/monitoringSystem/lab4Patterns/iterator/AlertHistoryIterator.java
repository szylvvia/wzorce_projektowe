package com.example.monitoringSystem.lab4Patterns.iterator;

public class AlertHistoryIterator implements MyIterator<String> {
    private final String[] alerts;
    private final int length;
    private int pos = 0;

    public AlertHistoryIterator(String[] alerts, int length) {
        this.alerts = alerts;
        this.length = length;
    }

    @Override
    public boolean hasNext() {
        return pos < length;
    }

    @Override
    public String next() {
        return alerts[pos++];
    }
}
