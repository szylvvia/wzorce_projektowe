//Tydzień 8, Zasada ISP - tester segregacji interfejsów
//Demonstruje zastosowanie Interface Segregation Principle w systemie monitoringu
//Pokazuje korzyści z podziału dużych interfejsów na mniejsze, specjalistyczne
package com.example.monitoringSystem.lab7.isp.ispK;

public class InterfaceSegregationTester {
    public static void main(String[] args) {
        System.out.println("=== ISP Example Tester ===");

        // 1. Temperature Sensor (segregacja SensorInterface)
        System.out.println("\n--- Temperature Sensor ---");
        TemperatureSensor tempSensor = new BasicTemperatureSensor();
        tempSensor.readTemperature();

        // 2. Alert System (segregacja AlertInterface)
        System.out.println("\n--- Email Alert ---");
        EmailAlert emailAlert = new EmailOnlyAlert();
        emailAlert.sendEmailAlert("Temperature too high!");

        // 3. Logger (segregacja DataLoggerInterface)
        System.out.println("\n--- File Logger ---");
        FileLogger fileLogger = new FileOnlyLogger();
        fileLogger.logToFile("Sensor data: Temp=25.4°C");
    }
}

//Koniec, Tydzień 8, Zasada ISP - tester segregacji

