//Tydzień 4, Wzorzec Facade - fasada systemu pomiarowego
//Zapewnia uproszczony interfejs do złożonego systemu różnych sensorów
//Koordynuje pracę sensorów temperatury, wilgotności i ciśnienia
package com.example.monitoringSystem.lab3Patterns.facade.MeasurementFacade;

public class MeasurementFacade {
    private final SensorFacade temperatureSensor;
    private final SensorFacade humiditySensor;
    private final SensorFacade pressureSensor;

    public MeasurementFacade() {
        this.temperatureSensor = new TemperatureSensorFacade();
        this.humiditySensor = new HumiditySensorFacade();
        this.pressureSensor = new PressureSensorFacade();
    }

    public double getTemperature() {
        return temperatureSensor.measure();
    }

    public double getHumidity() {
        return humiditySensor.measure();
    }

    public double getPressure() {
        return pressureSensor.measure();
    }
}
//Koniec, Tydzień 4, Wzorzec Facade - pomiary
