package com.example.monitoringSystem.lab8.functional.example1;

public class FunctionalInterfacesDemo {
    public static void main(String[] args) {
        // DataValidator
        double validTemp = 25;
        double freezingTemp = -30;
        double heatingTemp = 50;
        DataValidator tempValidator = value -> value >= freezingTemp && value <= heatingTemp;
        System.out.println("Temp 25 valid? " + tempValidator.validate(validTemp));

        // AlertFormatter
        double highTemp = 42.6;
        AlertFormatter formatter = (msg, val) -> String.format("ALERT: %s (%.2f)", msg, val);
        System.out.println(formatter.format("High Temperature", highTemp));

        // SensorAction
        double loggedValue = 23.5;
        SensorAction logAction = (name, val) -> System.out.println("Sensor [" + name + "] logged value: " + val);
        logAction.execute("TempSensor1", loggedValue);
    }
}
