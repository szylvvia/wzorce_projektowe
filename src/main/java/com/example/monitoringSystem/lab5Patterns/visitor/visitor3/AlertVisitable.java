package com.example.monitoringSystem.lab5Patterns.visitor.visitor3;

interface AlertVisitable {
    String accept(AlertVisitor alertVisitor);
}
