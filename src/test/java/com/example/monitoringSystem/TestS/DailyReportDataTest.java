package com.example.monitoringSystem.TestS;

import com.example.monitoringSystem.lab7.dip.dipS.dip2.DailyReportData;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class DailyReportDataTest {

    @Test
    void testDataIsNotNull() {
        DailyReportData reportData = new DailyReportData();
        assertNotNull(reportData.getDataToReport(), "Data should not be null");
    }

    @Test
    void testDataIsNonNegative() {
        DailyReportData reportData = new DailyReportData();
        Double data = reportData.getDataToReport();
        assertTrue(data >= 0, "Data should not be negative");
    }

    @Test
    void testDataWithinRange() {
        DailyReportData reportData = new DailyReportData();
        Double data = reportData.getDataToReport();
        assertTrue(data >= 0 && data <= 100, "Data should be within the range 0 to 100");
    }

    @Test
    void testDataIsRounded() {
        DailyReportData reportData = new DailyReportData();
        Double data = reportData.getDataToReport();
        assertEquals(data, Math.floor(data), "Data should be rounded to the nearest integer");
    }

    @Test
    void testMultipleCallsReturnDifferentValues() {
        DailyReportData reportData = new DailyReportData();
        Double data1 = reportData.getDataToReport();
        Double data2 = reportData.getDataToReport();
        assertNotEquals(data1, data2, "Multiple calls should return different values");
    }
}