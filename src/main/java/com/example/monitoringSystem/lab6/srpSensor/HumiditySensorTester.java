package com.example.monitoringSystem.lab6.srpSensor;

public class HumiditySensorTester {
    public static void main(String[] args) {
        HumiditySensorData humiditySensorData = new HumiditySensorData("Humidity Sensor", 45.0);
        HumiditySensorController sensorController = new HumiditySensorController(humiditySensorData);
        HumiditySensorDisplay sensorDisplay = new HumiditySensorDisplay(humiditySensorData);
        HumiditySensorDescribe sensorDescribe = new HumiditySensorDescribe(humiditySensorData);

        // Test the classes
        sensorController.turnOn();
        sensorDisplay.showMeasurement();
        sensorDescribe.getDetails();
        sensorController.reset();
        sensorController.turnOff();
    }
}
