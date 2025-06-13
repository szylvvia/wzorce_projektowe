//Tydzień 13, Test jednostkowy dla MonitoringSystemService (AOP)
//Testuje serwis systemu monitoringu z aspektami programowania aspektowego
//Weryfikuje poprawność operacji zapisu, odczytu i aktualizacji konfiguracji
package com.example.monitoringSystem.TestK;

import com.example.monitoringSystem.lab9.AspectJ2.MonitoringSystemService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;

public class MonitoringSystemServiceTest {

    private MonitoringSystemService service;

    @BeforeEach
    void setUp() {
        service = new MonitoringSystemService();
    }

    @Test
    void testSaveMeasurementDoesNotThrow() {
        assertDoesNotThrow(() -> service.saveMeasurement("TempSensor", 22.5),
                "Metoda saveMeasurement nie powinna rzucać wyjątku");
    }

    @Test
    void testReadTemperatureReturnsValidRange() {
        double temperature = service.readTemperature();
        assertTrue(temperature >= 0 && temperature <= 100,
                "Odczytana temperatura powinna być w zakresie 0-100");
    }

    @Test
    void testUpdateConfigReturnsSameValue() {
        String config = "NewThreshold=75";
        String result = service.updateConfig(config);
        assertEquals(config, result,
                "Zwrócona konfiguracja powinna być taka sama jak wejściowa");
    }

    @Test
    void testUpdateConfigNotNull() {
        String result = service.updateConfig("SafeMode=true");
        assertNotNull(result, "Zwrócona wartość nie powinna być null");
    }

    @Test
    void testReadTemperaturePerformance() {
        assertTimeout(Duration.ofMillis(100),
                () -> service.readTemperature(),
                "Odczyt temperatury powinien zakończyć się w 100ms");
    }
}
//Koniec, Tydzień 13, Test AOP MonitoringSystemService

