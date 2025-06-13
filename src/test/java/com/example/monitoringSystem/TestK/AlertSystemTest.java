//Tydzień 13, Testy jednostkowe - test systemu alertów Memento
//Sprawdza poprawność działania wzorca Memento w systemie powiadomień
//Weryfikuje przechowywanie i przywracanie stanu alertów
package com.example.monitoringSystem.TestK;

import com.example.monitoringSystem.lab4Patterns.memento.Alert.AlertMemento;
import com.example.monitoringSystem.lab4Patterns.memento.Alert.AlertSystem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlertSystemTest {

    @Test
    void testTriggerAlertStoresLastAlert() {
        AlertSystem alertSystem = new AlertSystem();
        alertSystem.triggerAlert("High temperature!");
        assertEquals("High temperature!", alertSystem.getLastAlert().getAlertMessage());
    }

    @Test
    void testRestoreAlert() {
        AlertSystem alertSystem = new AlertSystem();
        alertSystem.triggerAlert("First");
        alertSystem.triggerAlert("Second");
        AlertMemento memento = alertSystem.getLastAlert();
        alertSystem.restoreLastAlert(memento);
        assertEquals("Second", alertSystem.getLastAlert().getAlertMessage());
    }

    @Test
    void testMultipleAlerts() {
        AlertSystem alertSystem = new AlertSystem();
        alertSystem.triggerAlert("1");
        alertSystem.triggerAlert("2");
        alertSystem.triggerAlert("3");
        assertEquals("3", alertSystem.getLastAlert().getAlertMessage());
    }

    @Test
    void testRestoreNullDoesNothing() {
        AlertSystem alertSystem = new AlertSystem();
        alertSystem.restoreLastAlert(null);
        assertNull(alertSystem.getLastAlert());
    }

    @Test
    void testAlertHistoryPreserved() {
        AlertSystem alertSystem = new AlertSystem();
        alertSystem.triggerAlert("A");
        alertSystem.triggerAlert("B");
        alertSystem.restoreLastAlert(alertSystem.getLastAlert());
        assertEquals("B", alertSystem.getLastAlert().getAlertMessage());
    }
}

//Koniec, Tydzień 13, Testy - system alertów

