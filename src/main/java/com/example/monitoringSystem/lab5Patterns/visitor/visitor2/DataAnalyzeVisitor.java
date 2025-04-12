package com.example.monitoringSystem.lab5Patterns.visitor.visitor2;

interface DataAnalyzeVisitor {
    String accept(UrbanStation cityStation);
    String accept(SeaStation seaStation);
}
