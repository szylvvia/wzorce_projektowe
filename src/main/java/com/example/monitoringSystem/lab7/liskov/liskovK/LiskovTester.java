//Tydzień 8, Zasada LSP - tester podstawowej implementacji Liskov Substitution Principle
//Demonstruje że obiekty klas pochodnych mogą zastąpić obiekty klasy bazowej
//Wszystkie implementacje zachowują się zgodnie z kontraktem klasy bazowej
package com.example.monitoringSystem.lab7.liskov.liskovK;

public class LiskovTester {
    public static void main(String[] args) {
        System.out.println("=== Liskov Substitution Principle Test ===");

        // === MonitoringStation ===
        MonitoringStation abstractStation = new AirMonitoringStation("Warsaw");
        abstractStation.collectData();

        AirMonitoringStation concreteStation = new AirMonitoringStation("Frankfurt");
        concreteStation.collectData();

        // === DataTransmitter ===
        DataTransmitter abstractTransmitter = new WifiTransmitter();
        abstractTransmitter.transmitData("Temperature=24");

        WifiTransmitter concreteTransmitter = new WifiTransmitter();
        concreteTransmitter.transmitData("Humidity=40");

        // === EventHandler ===
        EventHandler abstractHandler = new SensorFailureHandler();
        abstractHandler.handleEvent("Pressure > max");

        SensorFailureHandler concreteHandler = new SensorFailureHandler();
        concreteHandler.handleEvent("Temperature < min");
    }
}

//Koniec, Tydzień 8, Zasada LSP - tester podstawowy