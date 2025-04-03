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

        AbstractExpression lessThan = new LessThan(30.0, "temperature");
        List<Double> result1 = lessThan.interpret(context);
        System.out.println("Values less than 30 in temperature: " + result1);

        AbstractExpression greaterThan = new GreaterThan(39.0, "humidity");
        List<Double> result2 = greaterThan.interpret(context);
        System.out.println("Values greater than 39 in humidity: " + result2);

        AbstractExpression expression1 = new OrExpression(lessThan, greaterThan);
        List<Double> result3 = expression1.interpret(context);
        System.out.println("Values less than 30 in temperature or greater than 39 in humidity: " + result3);

        AbstractExpression expression2 = new AndExpression(
                new LessThan(60.0, "humidity"),
                new GreaterThan(20.0, "temperature")
        );
        List<Double> result4 = expression2.interpret(context);
        System.out.println("Values less than 60 in humidity and greater than 1000 in pressure: " + result4);

        AbstractExpression expression3 = new OrExpression(
                new EqualToExpression("temperature", 25.0),
                new AndExpression(
                        new LessThan(60.0, "humidity"),
                        new GreaterThan(10.0, "humidity")
                )
        );
        List<Double> result5 = expression3.interpret(context);
        System.out.println("Values equal to 25 in temperature or (less than 60 in humidity and greater than 1000 in pressure): " + result5);
    }
}
