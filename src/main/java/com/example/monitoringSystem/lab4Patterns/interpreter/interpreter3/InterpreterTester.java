package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter3;

import com.example.monitoringSystem.lab4Patterns.interpreter.interpreter2.EnvironmentData;

import java.beans.Expression;
import java.util.List;
import java.util.Map;

public class InterpreterTester {
    public static void main(String[] args) {
        EnvironmentData data = new EnvironmentData(
                Map.of(
                        "2025-04-01", List.of(20.0, 22.5, 19.0),
                        "2025-04-02", List.of(21.0, 23.0, 20.5),
                        "2025-04-03", List.of(18.5, 21.2, 19.7)
                ),
                Map.of(
                        "2025-04-01", List.of(30.0, 35.0, 28.0),
                        "2025-04-02", List.of(32.0, 34.5, 31.0),
                        "2025-04-03", List.of(29.5, 33.0, 30.2)
                ),
                Map.of(
                        "2025-04-01", List.of(1012.0, 1015.0, 1010.0),
                        "2025-04-02", List.of(1011.0, 1013.5, 1009.5),
                        "2025-04-03", List.of(1008.0, 1012.5, 1011.3)
                )
        );

        int thresholdTemperatureForInterpreter = 25;
        String dateForTemperatureInterpreter = "2025-04-01";
        AbstractExpression tempExp = new TemperatureAnomalyChecker(thresholdTemperatureForInterpreter);
        boolean tempResult = tempExp.interpret(data, dateForTemperatureInterpreter);
        System.out.println("Temperature Anomaly: " + tempResult);

        double thresholdHumidityForInterpreter = 30.0;
        String dateForHumidityInterpreter = "2025-04-02";
        AbstractExpression humidityExp = new HumidityAnomalyChecker(thresholdHumidityForInterpreter);
        boolean humidityResult = humidityExp.interpret(data, dateForHumidityInterpreter);
        System.out.println("Humidity Anomaly: " + humidityResult);

        double thresholdPressureForInterpreter = 0;
        String dateForPressureInterpreter = "2025-04-03";
        AbstractExpression pressureExp = new PressureAnomalyChecker(thresholdPressureForInterpreter);
        boolean pressureResult = pressureExp.interpret(data, dateForPressureInterpreter);
        System.out.println("Pressure Anomaly: " + pressureResult);

        double thresholdHumidityForAnomalyChecker = 10.0;
        int thresholdTemperatureForAnomalyChecker = 7;
        String dateForAnomalyChecker = "2025-04-04";
        AbstractExpression condition = new AnomalyChecker(
                new HumidityAnomalyChecker(thresholdHumidityForAnomalyChecker),
                new TemperatureAnomalyChecker(thresholdTemperatureForAnomalyChecker));
        boolean conditionResult = condition.interpret(data, dateForAnomalyChecker);
        System.out.println("Condition Anomaly: " + conditionResult);
    }
}
