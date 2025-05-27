package com.example.monitoringSystem.TestK;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.example.monitoringSystem.lab2Patterns.adapter.TemperatureUnitAdapter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureUnitAdapterTest {

    @Test
    void testCelsiusToFahrenheit() {
        TemperatureUnitAdapter adapter = new TemperatureUnitAdapter(0);
        assertEquals(32.0, adapter.toFahrenheit(), 0.001);
    }

    @Test
    void testCelsiusToKelvin() {
        TemperatureUnitAdapter adapter = new TemperatureUnitAdapter(0);
        assertEquals(273.15, adapter.toKelvin(), 0.001);
    }

    @Test
    void testNegativeCelsius() {
        TemperatureUnitAdapter adapter = new TemperatureUnitAdapter(-10);
        assertEquals(14.0, adapter.toFahrenheit(), 0.001);
    }

    @Test
    void testHighCelsius() {
        TemperatureUnitAdapter adapter = new TemperatureUnitAdapter(100);
        assertEquals(212.0, adapter.toFahrenheit(), 0.001);
    }

    @Test
    void testPrecision() {
        TemperatureUnitAdapter adapter = new TemperatureUnitAdapter(36.6);
        assertEquals(97.88, adapter.toFahrenheit(), 0.01);
    }
}
