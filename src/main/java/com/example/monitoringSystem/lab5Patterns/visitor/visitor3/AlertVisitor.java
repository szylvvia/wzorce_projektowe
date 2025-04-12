package com.example.monitoringSystem.lab5Patterns.visitor.visitor3;

interface AlertVisitor {
    public abstract String visit(Country countryStation);
    public abstract String visit(Department departmentStation);
}
