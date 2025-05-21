package com.example.monitoringSystem.lab2Patterns.decorator.Alert;

import java.util.Random;

// Decorator - Alert on high values
public class AlertDecorator extends MeasurementDecorator {
    private final Random random = new Random();

    public AlertDecorator(MeasurementStation station) {
        super(station);
    }

    @Override
    public String measure() {
        StringBuilder result = new StringBuilder(super.measure());
        int temperatureThreshold = 30; // Threshold for alert
        int simulatedTemperatureOffset = 20;
        int simulatedTemperatureMultiply = 2;
        double temperature = simulatedTemperatureOffset + random.nextDouble() * simulatedTemperatureMultiply;

        result.append("Measured Temperature: ").append(String.format("%.2f", temperature)).append("°C<br>");
        if (temperature > temperatureThreshold) {
            result.append("<strong>⚠ ALERT: High temperature detected!</strong><br>");
        }

        return result.toString();
    }

}
