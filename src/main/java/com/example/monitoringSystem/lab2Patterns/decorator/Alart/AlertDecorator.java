package com.example.monitoringSystem.lab2Patterns.decorator.Alart;

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
        double temperature = 20 + random.nextDouble() * 15; // Simulated temperature

        result.append("Measured Temperature: ").append(String.format("%.2f", temperature)).append("°C<br>");
        if (temperature > 30) {
            result.append("<strong>⚠ ALERT: High temperature detected!</strong><br>");
        }

        return result.toString();
    }

}
