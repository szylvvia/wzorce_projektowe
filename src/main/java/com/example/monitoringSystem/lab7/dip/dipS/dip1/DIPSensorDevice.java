//Tydzień 8, Zasada DIP (Dependency Inversion Principle), urządzenie czujnika zależne od abstrakcji
//Konkretna implementacja wykorzystująca wstrzykiwanie zależności zgodnie z DIP
//Demonstruje walidację parametrów i obsługę wyjątków w kontekście zasady DIP
package com.example.monitoringSystem.lab7.dip.dipS.dip1;

import com.example.monitoringSystem.lab7.dip.dipS.exceptions.NegativeResolutionException;

public class DIPSensorDevice extends SensorDevice {

    public DIPSensorDevice(ISensor sensor) {
        super(sensor);
    }

    @Override
    public void measure(double resolution) {
        if (resolution <= 0) {
            throw new NegativeResolutionException("Rozdzielczość nie może być ujemna");
        }
        System.out.println("Pomiar z rozdzielczością: " + resolution);
        sensor.readValue();
    }

}
//Koniec, Tydzień 8, Zasada DIP - urządzenie czujnika
