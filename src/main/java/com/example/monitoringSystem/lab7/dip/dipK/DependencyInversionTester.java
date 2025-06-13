package com.example.monitoringSystem.lab7.dip.dipK;

//Tydzień 8, Zasada DIP 1
//Dependency Inversion Principle - moduły wysokiego poziomu nie powinny zależeć od modułów niskiego poziomu
//Oba powinny zależeć od abstrakcji, a abstrakcje nie powinny zależeć od szczegółów

public class DependencyInversionTester {
    public static void main(String[] args) {
        System.out.println("=== Dependency Inversion Principle Test ===");

        // Przykład 1: Data Transmission
        DataTransmitter transmitter = new HttpDataTransmitter("http://example.com/api");
        MonitoringService monitoringService = new MonitoringService(transmitter);
        monitoringService.sendData("Temperature: 22.5°C");

        // Przykład 2: Notification Management
        NotificationSender sender = new EmailNotificationSender("admin@example.com");
        AlertService alertService = new AlertService(sender);
        alertService.triggerAlert("Critical humidity drop detected!");        // Przykład 3: Measurement Processing
        MeasurementProcessor processor = new AverageMeasurementProcessor();
        MeasurementAnalyzer analyzer = new MeasurementAnalyzer(processor);
        analyzer.analyze(new double[]{22.5, 23.0, 21.5, 22.0});
    }
}
//Koniec, Tydzień 8, Zasada DIP 1

