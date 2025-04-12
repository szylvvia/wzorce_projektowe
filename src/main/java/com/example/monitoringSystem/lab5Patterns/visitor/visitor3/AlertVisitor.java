package com.example.monitoringSystem.lab5Patterns.visitor.visitor3;

interface AlertVisitor {
    String visit(Country countryStation);
    String visit(Department departmentStation);
}
