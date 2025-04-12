package com.example.monitoringSystem.lab5Patterns.visitor.visitor1;

interface StationVisitor {
    String visit(CityStation cityStation);
    String visit(ForestStation forestStation);
}
