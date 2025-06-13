//Tydzień 8, Zasada DIP (Dependency Inversion Principle), konkretna implementacja czujnika
//Niskpoziomowy moduł implementujący abstrakcję ISensor zgodnie z DIP
//Może być zastąpiony innymi implementacjami bez wpływu na moduły wysokopoziomowe
package com.example.monitoringSystem.lab7.dip.dipS.dip1;

public class MyDIPSensorDevice implements ISensor {

    @Override
    public void readValue() {
        int randomValueRange = 100;
        double randomRoundValue = 100.0;
        double randomValue = Math.random() * randomValueRange;
        randomValue = Math.round(randomValue * randomRoundValue) / randomRoundValue;
        System.out.println("Pomiar wartosci..." + randomValue);
    }
}
//Koniec, Tydzień 8, Zasada DIP - implementacja czujnika
