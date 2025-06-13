//Tydzień 3, Wzorzec Decorator - bazowa klasa dekoratora sensora
//Implementuje interfejs komponentu i deleguje wywołania do dekorowanego obiektu
//Stanowi podstawę dla konkretnych dekoratorów dodających nowe funkcjonalności
package com.example.monitoringSystem.lab2Patterns.decorator.Sensor;

public class SensorSensorDecorator implements SensorSensor {
    protected SensorSensor sensorSensor;

    public SensorSensorDecorator(SensorSensor sensorSensor) {
        this.sensorSensor = sensorSensor;
    }

    @Override
    public void calibrateSensor() {
        this.sensorSensor.calibrateSensor();
    }
}
//Koniec, Tydzień 3, Wzorzec Decorator - bazowy dekorator
