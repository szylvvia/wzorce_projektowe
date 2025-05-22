package com.example.monitoringSystem.TestdipM;

import com.example.monitoringSystem.lab7.dip.dipM.AverageProcessor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AverageProcessorTest {

    private final AverageProcessor processor = new AverageProcessor();

    @Test
    void testAverageOfPositiveNumbers() {
        double[] data = {2.0, 4.0, 6.0};
        assertEquals(4.0, processor.process(data));
    }

    @Test
    void testAverageOfNegativeNumbers() {
        double[] data = {-3.0, -6.0, -9.0};
        assertEquals(-6.0, processor.process(data));
    }

    @Test
    void testAverageOfZeros() {
        double[] data = {0.0, 0.0, 0.0};
        assertEquals(0.0, processor.process(data));
    }

    @Test
    void testAverageSingleElement() {
        double[] data = {42.0};
        assertEquals(42.0, processor.process(data));
    }

    @Test
    void testAverageMixedNumbers() {
        double[] data = {10.0, -10.0, 20.0, -20.0};
        assertEquals(0.0, processor.process(data));
    }
}

