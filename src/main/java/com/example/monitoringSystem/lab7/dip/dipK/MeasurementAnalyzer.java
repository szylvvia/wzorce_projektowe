//Tydzień 8, Zasada DIP (Dependency Inversion Principle), analizator pomiarów zależny od abstrakcji
//Wysokopoziomowy moduł wykorzystujący abstrakcję MeasurementProcessor zgodnie z DIP
//Nie zależy od konkretnych implementacji procesora, co zwiększa elastyczność systemu
package com.example.monitoringSystem.lab7.dip.dipK;

public class MeasurementAnalyzer {
    private final MeasurementProcessor processor;

    public MeasurementAnalyzer(MeasurementProcessor processor) {
        this.processor = processor;
    }

    public void analyze(double[] data) {
        double result = processor.process(data);
        System.out.println("Processed average: " + result);
    }
}
//Koniec, Tydzień 8, Zasada DIP - analizator pomiarów

