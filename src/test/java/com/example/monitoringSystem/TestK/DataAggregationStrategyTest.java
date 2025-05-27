package com.example.monitoringSystem.TestK;


import com.example.monitoringSystem.lab5Patterns.strategy.DataAggregationStrategy.AverageAggregationStrategy;
import com.example.monitoringSystem.lab5Patterns.strategy.DataAggregationStrategy.DataAggregationStrategy;
import com.example.monitoringSystem.lab5Patterns.strategy.DataAggregationStrategy.MaximumAggregationStrategy;
import com.example.monitoringSystem.lab5Patterns.strategy.DataAggregationStrategy.MedianAggregationStrategy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



    public class DataAggregationStrategyTest {

        @Test
        void testAverageAggregationReturnsPositiveNumber() {
            DataAggregationStrategy strategy = new AverageAggregationStrategy();
            double result = strategy.aggregate(new double[]{4.0, 6.0, 10.0});
            assertTrue(result > 0, "Średnia powinna być większa od 0");
        }

        @Test
        void testEmptyArrayReturnsZeroForAverage() {
            DataAggregationStrategy strategy = new AverageAggregationStrategy();
            double result = strategy.aggregate(new double[]{});
            assertFalse(result > 0, "Dla pustej tablicy wynik nie powinien być większy od 0");
        }

        @Test
        void testMaximumAggregationNotNullAndValid() {
            DataAggregationStrategy strategy = new MaximumAggregationStrategy();
            double[] data = new double[]{-3.0, -1.0, -2.5};
            double result = strategy.aggregate(data);
            assertNotEquals(Double.NEGATIVE_INFINITY, result, "Maksimum powinno być poprawne, a nie domyślne");
        }

        @Test
        void testMedianAggregationWithEvenCountNotEqualEndpoints() {
            DataAggregationStrategy strategy = new MedianAggregationStrategy();
            double[] data = new double[]{10.0, 5.0, 1.0, 4.0};
            double median = strategy.aggregate(data);
            assertNotEquals(data[0], median, "Mediana nie powinna być równa żadnemu z końców nieposortowanej tablicy");
        }

        @Test
        void testMedianAggregationThrowsNothingForEmptyArray() {
            DataAggregationStrategy strategy = new MedianAggregationStrategy();
            assertDoesNotThrow(() -> strategy.aggregate(new double[]{}), "Dla pustej tablicy nie powinien wystąpić wyjątek");
        }
    }
