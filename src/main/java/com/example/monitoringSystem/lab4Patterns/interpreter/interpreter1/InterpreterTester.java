package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter1;

import java.util.List;
import java.util.Map;

public class InterpreterTester {
    public static void main(String[] args) {
        Context context = new Context(Map.of(
                "temperature", List.of(20.0, 25.0, 30.0),
                "humidity", List.of(30.0, 40.0, 50.0, 60.0),
                "pressure", List.of(1000.0, 1010.0, 1020.0)
        ));

        double lessThanValue = 30.0;
        AbstractExpression lessThan = new LessThan(lessThanValue, "temperature");
        List<Double> result1 = lessThan.interpret(context);
        System.out.println("Values less than" + lessThanValue + " in temperature: " + result1);

        double greaterThanValue = 39.0;
        AbstractExpression greaterThan = new GreaterThan(greaterThanValue, "humidity");
        List<Double> result2 = greaterThan.interpret(context);
        System.out.println("Values greater than " + greaterThanValue + " in humidity: " + result2);

        AbstractExpression expression1 = new OrExpression(lessThan, greaterThan);
        List<Double> result3 = expression1.interpret(context);
        System.out.println("Values less than " + lessThanValue + " in temperature or greater than " + greaterThanValue + " in humidity: " + result3);

        double lessThanValueForAndExpression = 60.0;
        double greaterThanValueForAndExpression = 20.0;
        AbstractExpression expression2 = new AndExpression(
                new LessThan(lessThanValueForAndExpression, "humidity"),
                new GreaterThan(greaterThanValueForAndExpression, "temperature")
        );
        List<Double> result4 = expression2.interpret(context);
        System.out.println("Values less than " + lessThanValueForAndExpression + " in humidity and greater than " + greaterThanValueForAndExpression + " in temperature: " + result4);

        double equalToValueForOrExpression = 25.0;
        double greaterThanValueForOrExpression = 10.0;
        double lessThanValueForOrExpression = 60.0;
        AbstractExpression expression3 = new OrExpression(
                new EqualToExpression("temperature", equalToValueForOrExpression),
                new AndExpression(
                        new LessThan(lessThanValueForOrExpression, "humidity"),
                        new GreaterThan(greaterThanValueForOrExpression, "humidity")
                )
        );
        List<Double> result5 = expression3.interpret(context);
        System.out.println("Values equal to " + equalToValueForOrExpression + " in temperature or (less than " + lessThanValueForOrExpression + " in humidity and greater than " + greaterThanValueForOrExpression + " in pressure): " + result5);
    }
}
