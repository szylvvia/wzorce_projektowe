package com.example.monitoringSystem.lab6.srpSensor;

//Tydzień 7, Zasada SRP 1
//Single Responsibility Principle - każda klasa ma jedną odpowiedzialność
//Podział sensor wilgotności na oddzielne klasy: dane, kontroler, wyświetlanie, opis
public class HumiditySensorTester {
    public static void main(String[] args) {
        double humidity = 45.0;
        HumiditySensorData humiditySensorData = new HumiditySensorData("Humidity Sensor", humidity);
        HumiditySensorController sensorController = new HumiditySensorController(humiditySensorData);
        HumiditySensorDisplay sensorDisplay = new HumiditySensorDisplay(humiditySensorData);
        HumiditySensorDescribe sensorDescribe = new HumiditySensorDescribe(humiditySensorData);        // Test the classes
        sensorController.turnOn();
        sensorDisplay.showMeasurement();
        sensorDescribe.getDetails();
        sensorController.reset();
        sensorController.turnOff();
    }
}
//Koniec, Tydzień 7, Zasada SRP 1
