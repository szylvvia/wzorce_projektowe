package com.example.monitoringSystem.lab3Patterns.flyweight.flyweight1;
import java.util.ArrayList;
import java.util.List;


public class DigitalSensorTester {
    private List<DigitalSensor> digitalSensors = new ArrayList<>();

    public DigitalSensorTester()
    {
        for(int i=0; i<10; i++) {
            appendSenorWithDetails(EnvironmentalDetailsFactory.SensorType.TEMPERATURE);
        }
        for(int i=0; i<10; i++) {
            appendSenorWithDetails(EnvironmentalDetailsFactory.SensorType.HUMIDITY);
        }
        for(int i=0; i<10; i++) {
            appendSenorWithDetails(EnvironmentalDetailsFactory.SensorType.PRESSURE);
        }
    }

    private void appendSenorWithDetails(EnvironmentalDetailsFactory.SensorType sensorType) {
        EnvironmentalFlySensorDetails environmentalFlySensorDetails = EnvironmentalDetailsFactory.getEnvironmentalFlySensorDetails(sensorType);

        int value = (int) (Math.random() * 100);
        int value2 = (int) (Math.random() * 10);
        String str = String.valueOf(value);
        String str2 = "Model "+value2;
        DigitalSensor digital1 = new DigitalSensor(str, str2);
        digital1.setEnvironmentalFlySensorDetails(environmentalFlySensorDetails);
        System.out.println(digital1);
        digitalSensors.add(digital1);

    }

    public static void main(String[] args) {
        System.out.println("--- Flyweight pattern 1 ---");
        DigitalSensorTester digitalSensorTester = new DigitalSensorTester();
    }
}
