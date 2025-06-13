package com.example.monitoringSystem.lab1Patterns.builder;

//Tydzień 2, Builder Pattern, Tester do testowania wzorca budowniczego dla obiektów systemu monitoringu
public class TestBuilder {
    public static void main(String[] args) {
        MeasuringStation station = new MeasuringStation.StationBuilder("Station A", "New York").build();

        double pressureForReport = 1013.25;
        double temperatureForReport = 22.5;
        double humidityForReport = 65.0;

        Report report = new Report.ReportBuilder("2025-03-12", "New York", "Daily Report", station.name)
                .setPressure(pressureForReport)
                .setTemperature(temperatureForReport)
                .setHumidity(humidityForReport)
                .build();

        Notification notification = new Notification.NotificationBuilder("New report available for Station A").build();

        System.out.println("Report created for: " + report);
        System.out.println("Notification: " + notification);
    }
}
//Koniec, Tydzień 2, Builder Pattern