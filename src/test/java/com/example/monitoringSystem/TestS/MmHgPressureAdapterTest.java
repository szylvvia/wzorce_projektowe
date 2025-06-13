//Tydzień 13, Test jednostkowy dla MmHgPressureAdapter (Adapter Pattern)
//Testuje wzorzec Adapter dla konwersji ciśnienia z hPa na mmHg
//Weryfikuje poprawność konwersji jednostek i obsługę wyjątków w pomiarach ciśnienia
package com.example.monitoringSystem.TestS;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import com.example.monitoringSystem.lab2Patterns.adapter.MmHgPressureAdapter;
import com.example.monitoringSystem.lab2Patterns.adapter.exceptions.InvalidMeasurementException;
import com.example.monitoringSystem.lab2Patterns.adapter.exceptions.OutOfRangeMeasurementException;
import com.example.monitoringSystem.lab2Patterns.adapter.exceptions.UnsupportedUnitConversionException;

//Testy jednostkowe dla wzorca Adapter - konwersja ciśnienia z hPa na mmHg
public class MmHgPressureAdapterTest {

    @Test
    void testHpaToMmHgConversion() {
        MmHgPressureAdapter adapter = new MmHgPressureAdapter(1013.25);
        assertEquals(759.99, adapter.toMmHg(), 0.01);
    }

    @Test
    void testNegativePressureThrowsException() {
        assertThrows(InvalidMeasurementException.class, () -> new MmHgPressureAdapter(-1));
    }

    @Test
    void testPressureExceedsMaxRangeThrowsException() {
        assertThrows(OutOfRangeMeasurementException.class, () -> new MmHgPressureAdapter(2001));
    }

    @Test
    void testMmHgConversionPrecision() {
        MmHgPressureAdapter adapter = new MmHgPressureAdapter(1000);
        assertEquals(750.06, adapter.toMmHg(), 0.001);
    }

    @Test
    void testUnsupportedPsiConversionThrowsException() {
        MmHgPressureAdapter adapter = new MmHgPressureAdapter(1013.25);
        assertThrows(UnsupportedUnitConversionException.class, adapter::toPsi);
    }
}
//Koniec, Tydzień 13, Test Adapter Pattern - konwersja ciśnienia
