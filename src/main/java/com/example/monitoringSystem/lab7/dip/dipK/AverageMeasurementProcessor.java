//Tydzień 8, Zasada DIP (Dependency Inversion Principle), konkretny procesor obliczający średnią
//Niskpoziomowy moduł implementujący abstrakcję MeasurementProcessor
//Może być zastąpiony innymi procesorami bez wpływu na moduły wysokopoziomowe
package com.example.monitoringSystem.lab7.dip.dipK;

public class AverageMeasurementProcessor extends AbstractMeasurementProcessor {
    @Override
    public double process(double[] values) {
        double sum = 0;
        for (double val : values) sum += val;
        return sum / values.length;
    }
}
//Koniec, Tydzień 8, Zasada DIP - procesor średniej

