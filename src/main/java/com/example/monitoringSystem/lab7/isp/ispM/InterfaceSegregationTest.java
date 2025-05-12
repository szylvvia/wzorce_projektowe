package com.example.monitoringSystem.lab7.isp.ispM;

import com.example.monitoringSystem.lab7.isp.ispM.IDataExporterFile.ICSVExportable;
import com.example.monitoringSystem.lab7.isp.ispM.ISensorFile.*;
import com.example.monitoringSystem.lab7.isp.ispM.IStationControlFile.IStartable;
import com.example.monitoringSystem.lab7.isp.ispM.IStationControlFile.IStoppable;

public class InterfaceSegregationTest {
    public static void main(String[] args) {

        // 🛑 TEST: Problem z "grubym" interfejsem ISensor
        System.out.println("=== TEST: Wrong Interface (ISensor) ===");
        ISensor fullSensor = new FullSensorImpl();
        double value = fullSensor.readValue();
        System.out.println("Value: " + value);
        fullSensor.calibrate();
        fullSensor.reset();
        fullSensor.displayStatus();

        // ✅ TEST: Prawidłowa segregacja interfejsów
        System.out.println("\n=== TEST: Segregated Interfaces ===");

        IReadSensor readSensor = new BasicSensor();
        System.out.println("Odczyt: " + readSensor.readValue());

        ICalibratable calibratable = (ICalibratable) readSensor;
        calibratable.calibrate();

        IResettable resettable = (IResettable) readSensor;
        resettable.reset();

        IStatusDisplayable statusDisplayable = (IStatusDisplayable) readSensor;
        statusDisplayable.displayStatus();


        System.out.println("\n---------------------------------");



        ICSVExportable csvLogger = new CSVLogger();
        csvLogger.exportToCSV();

        IStartable startable = new SimpleStationController();
        IStoppable stoppable = (IStoppable) startable;
        startable.start();
        stoppable.stop();

    }
}
