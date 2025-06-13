//Tydzień 5, Wzorzec Interpreter - tester drugiej implementacji
//Testuje rozszerzoną wersję interpretera dla danych środowiskowych
//Obsługuje złożone reguły anomalii dla temperatur, ciśnienia i wilgotności
package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter2;

import java.util.List;
import java.util.Map;

//Tydzień 5, Interpreter Pattern, Tester do testowania interpreterów z danymi środowiskowymi
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
        AbstractExpression tempExp = new TemperatureInterpreter(thresholdTemperatureForInterpreter);
        String tempResult = tempExp.interpret(data, dateForTemperatureInterpreter);
        System.out.println(tempResult);

        double thresholdHumidityForInterpreter = 30.0;
        String dateForHumidityInterpreter = "2025-04-02";
        AbstractExpression humidityExp = new HumidityInterpreter(thresholdHumidityForInterpreter);
        String humidityResult = humidityExp.interpret(data, dateForHumidityInterpreter);
        System.out.println(humidityResult);

        double thresholdPressureForInterpreter = 1010.0;
        String dateForPressureInterpreter = "2025-04-03";
        AbstractExpression pressureExp = new PressureInterpreter(thresholdPressureForInterpreter);
            String pressureResult = pressureExp.interpret(data, dateForPressureInterpreter);
        System.out.println(pressureResult);

        double thresholdHumidityForNone = 10.0;
        String dateForNoneInterpreter = "2025-04-04";
        AbstractExpression noneExp = new PressureInterpreter(thresholdHumidityForNone);
        String noneResult = noneExp.interpret(data, dateForNoneInterpreter);
        System.out.println(noneResult);

        double thresholdHumidityForAnomalyChecker = 10.0;
        int thresholdTemperatureForAnomalyChecker = 7;
        double pressureThresholdForAnomalyChecker = 1010.0;
        AbstractExpression condition = new OrAnomalyChecker(
                new HumidityInterpreter(thresholdHumidityForAnomalyChecker),
                new TemperatureInterpreter(thresholdTemperatureForAnomalyChecker),
                new PressureInterpreter(pressureThresholdForAnomalyChecker));

        String dateForCondition = "2025-04-01";
        String conditionResult = condition.interpret(data, dateForCondition);
        System.out.println(conditionResult);

    }

}
//Koniec, Tydzień 5, Wzorzec Interpreter - tester zaawansowany
