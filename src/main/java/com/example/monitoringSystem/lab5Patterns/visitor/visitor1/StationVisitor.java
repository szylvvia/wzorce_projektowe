package com.example.monitoringSystem.lab5Patterns.visitor.visitor1;

public interface StationVisitor {
    String visit(CityStation cityStation);
    String visit(ForestStation forestStation);
}
