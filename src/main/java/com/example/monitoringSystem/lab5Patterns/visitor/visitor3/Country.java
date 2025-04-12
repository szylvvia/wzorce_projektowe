package com.example.monitoringSystem.lab5Patterns.visitor.visitor3;

class Country implements AlertVisitable {
    private String name;
    private String alertLevel;
    private String dangerousLevel = "Low";

    public Country(String name, String alertLevel, String dangerousLevel) {
        this.name = name;
        this.alertLevel = alertLevel;
        this.dangerousLevel = dangerousLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlertLevel() {
        return alertLevel;
    }

    public String getDangerousLevel() {
        return dangerousLevel;
    }

    public String getAllData() {
        return "Country: " + name + " | Alert Level: " + alertLevel + " | Dangerous Level: " + dangerousLevel;
    }

    @Override
    public String accept(AlertVisitor alertVisitor) {
        return alertVisitor.visit(this);
    }
}
