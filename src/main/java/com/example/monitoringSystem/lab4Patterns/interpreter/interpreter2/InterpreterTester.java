package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter2;

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

        AbstractExpression tempExp = new TemperatureInterpreter(22);
        String tempResult = tempExp.interpret(data, "2025-04-01");
        System.out.println(tempResult);

        AbstractExpression humidityExp = new HumidityInterpreter(30.0);
        String humidityResult = humidityExp.interpret(data, "2025-04-02");
        System.out.println(humidityResult);

        AbstractExpression pressureExp = new PressureInterpreter(1010.0);
        String pressureResult = pressureExp.interpret(data, "2025-04-03");
        System.out.println(pressureResult);

        AbstractExpression noneExp = new PressureInterpreter(1010.0);
        String noneResult = noneExp.interpret(data, "2025-04-04");
        System.out.println(noneResult);

    }
}
