package com.example.monitoringSystem.TestS;

import com.example.monitoringSystem.lab7.dip.dipS.dip3.WeeklyData;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class WeeklyDataTest {

    @Test
    void testTemperatureDataSize() {
        WeeklyData weeklyData = new WeeklyData();
        List<Double> temperatureData = weeklyData.getTemperatureData();
        assertEquals(7, temperatureData.size(), "Temperature data should contain 7 values.");
    }

    @Test
    void testHumidityDataSize() {
        WeeklyData weeklyData = new WeeklyData();
        List<Double> humidityData = weeklyData.getHumidityData();
        assertEquals(7, humidityData.size(), "Humidity data should contain 7 values.");
    }

    @Test
    void testHumidityDataIsRounded() {
        WeeklyData weeklyData = new WeeklyData();
        List<Double> humidityData = weeklyData.getHumidityData();
        for (Double value : humidityData) {
            assertEquals(value, (double) value.intValue(), "Humidity values should be rounded.");
        }
    }

    @Test
    void testHumidityDataNotNull() {
        WeeklyData weeklyData = new WeeklyData();
        List<Double> humidityData = weeklyData.getHumidityData();
        for (Double value : humidityData) {
            assertNotNull(value, "Humidity values should not be null.");
        }
    }

    @Test
    void testRandomnessOfData() {
        WeeklyData weeklyData1 = new WeeklyData();
        WeeklyData weeklyData2 = new WeeklyData();
        List<Double> temperatureData1 = weeklyData1.getTemperatureData();
        List<Double> temperatureData2 = weeklyData2.getTemperatureData();
        assertNotEquals(temperatureData1, temperatureData2, "Temperature data should be random and not identical.");
    }
}