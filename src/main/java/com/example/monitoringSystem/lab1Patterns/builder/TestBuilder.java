package com.example.monitoringSystem.lab1Patterns.builder;

public class TestBuilder {
    public static void main(String[] args) {
        MeasuringStation station = new MeasuringStation.StationBuilder("Station A", "New York").build();

        Report report = new Report.ReportBuilder("2025-03-12", "New York", "Daily Report", station.name)
                .setPressure(1013.25)
                .setTemperature(22.5)
                .setHumidity(65.0)
                .build();

        Notification notification = new Notification.NotificationBuilder("New report available for Station A").build();

        System.out.println("Report created for: " + report);
        System.out.println("Notification: " + notification);
    }
}