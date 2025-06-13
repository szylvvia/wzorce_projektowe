//Tydzień 8, Zasada DIP (Dependency Inversion Principle), procesor obliczający średnią
//Konkretna implementacja abstrakcji IMeasurementProcessor zgodnie z DIP
//Niskpoziomowy moduł, który może być zastąpiony bez wpływu na moduły wysokopoziomowe
package com.example.monitoringSystem.lab7.dip.dipM;

public class AverageProcessor  extends AbstractProcessor {
    @Override
    public double process(double[] data) {
        double sum = 0;
        for (double d : data) sum += d;
        return sum / data.length;
    }
}
//Koniec, Tydzień 8, Zasada DIP - procesor średniej