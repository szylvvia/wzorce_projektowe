package com.example.monitoringSystem.lab5Patterns.visitor.visitor3;

public class Department implements AlertVisitable {
    private String name;
    private String alertLevel;

    public Department(String name, String alertLevel) {
        this.name = name;
        this.alertLevel = alertLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAllData() {
        return "Department: " + name + " - alert Level: " + alertLevel;
    }

    public String getAlertLevel() {
        return alertLevel;
    }

    public String getDepartmentName() {
        return name;
    }


    @Override
    public String accept(AlertVisitor alertVisitor) {
        return alertVisitor.visit(this);
    }
}
