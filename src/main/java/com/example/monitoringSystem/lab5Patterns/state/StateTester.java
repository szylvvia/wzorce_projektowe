package com.example.monitoringSystem.lab5Patterns.state;

import com.example.monitoringSystem.lab5Patterns.state.AlertState.AlertContext;
import com.example.monitoringSystem.lab5Patterns.state.AlertState.CriticalAlertState;
import com.example.monitoringSystem.lab5Patterns.state.AlertState.NormalAlertState;
import com.example.monitoringSystem.lab5Patterns.state.AlertState.WarningAlertState;
import com.example.monitoringSystem.lab5Patterns.state.SensorState.CalibrationState;
import com.example.monitoringSystem.lab5Patterns.state.SensorState.FaultState;
import com.example.monitoringSystem.lab5Patterns.state.SensorState.OperationalState;
import com.example.monitoringSystem.lab5Patterns.state.SensorState.SensorContext;
import com.example.monitoringSystem.lab5Patterns.state.StationState.ActiveState;
import com.example.monitoringSystem.lab5Patterns.state.StationState.IdleState;
import com.example.monitoringSystem.lab5Patterns.state.StationState.MaintenanceState;
import com.example.monitoringSystem.lab5Patterns.state.StationState.MonitoringStationContext;

public class StateTester {
    public static void main(String[] args) {
        System.out.println("=== Testing Monitoring Station State ===");
        MonitoringStationContext stationContext = new MonitoringStationContext();
        stationContext.setState(new IdleState());
        stationContext.reportState();
        stationContext.setState(new ActiveState());
        stationContext.reportState();
        stationContext.setState(new MaintenanceState());
        stationContext.reportState();

        System.out.println("\n=== Testing Sensor State ===");
        SensorContext sensorContext = new SensorContext();
        sensorContext.setState(new OperationalState());
        sensorContext.displayStatus();
        sensorContext.setState(new FaultState());
        sensorContext.displayStatus();
        sensorContext.setState(new CalibrationState());
        sensorContext.displayStatus();

        System.out.println("\n=== Testing Alert State ===");
        AlertContext alertContext = new AlertContext();
        alertContext.setAlertState(new NormalAlertState());
        alertContext.displayAlert();
        alertContext.setAlertState(new WarningAlertState());
        alertContext.displayAlert();
        alertContext.setAlertState(new CriticalAlertState());
        alertContext.displayAlert();
    }
}
