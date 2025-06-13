package com.example.monitoringSystem.lab5Patterns.strategy;

import com.example.monitoringSystem.lab5Patterns.strategy.AlertStrategy.AlertEvaluator;
import com.example.monitoringSystem.lab5Patterns.strategy.AlertStrategy.RateOfChangeAlertStrategy;
import com.example.monitoringSystem.lab5Patterns.strategy.AlertStrategy.StatisticalAlertStrategy;
import com.example.monitoringSystem.lab5Patterns.strategy.AlertStrategy.ThresholdAlertStrategy;
import com.example.monitoringSystem.lab5Patterns.strategy.DataAggregationStrategy.AverageAggregationStrategy;
import com.example.monitoringSystem.lab5Patterns.strategy.DataAggregationStrategy.DataAggregator;
import com.example.monitoringSystem.lab5Patterns.strategy.DataAggregationStrategy.MaximumAggregationStrategy;
import com.example.monitoringSystem.lab5Patterns.strategy.DataAggregationStrategy.MedianAggregationStrategy;
import com.example.monitoringSystem.lab5Patterns.strategy.DataTransmissionStrategy.DataTransmitter;
import com.example.monitoringSystem.lab5Patterns.strategy.DataTransmissionStrategy.HttpTransmissionStrategy;
import com.example.monitoringSystem.lab5Patterns.strategy.DataTransmissionStrategy.MqttTransmissionStrategy;
import com.example.monitoringSystem.lab5Patterns.strategy.DataTransmissionStrategy.WebSocketTransmissionStrategy;

//Tydzień 6, Strategy Pattern, Tester demonstrujący różne strategie w systemie monitoringu
//Strategy pattern dla różnych strategii przetwarzania danych - enkapsuluje algorytmy w oddzielnych klasach
//Umożliwia dynamiczną zmianę algorytmu w czasie wykonywania programu
public class StrategyTester {
    public static void main(String[] args) {
        System.out.println("=== Data Aggregation Strategy ===");
        DataAggregator aggregator = new DataAggregator();
        double[] sensorData = {23.4, 25.0, 22.1, 24.7, 23.9};

        double avg = aggregator.aggregateData(sensorData, new AverageAggregationStrategy());
        double median = aggregator.aggregateData(sensorData, new MedianAggregationStrategy());
        double max = aggregator.aggregateData(sensorData, new MaximumAggregationStrategy());
        System.out.println("Average: " + avg);
        System.out.println("Median: " + median);
        System.out.println("Maximum: " + max);

        System.out.println("\n=== Data Transmission Strategy ===");
        DataTransmitter transmitter = new DataTransmitter();
        String data = "Sensor reading: 23.4°C";
        System.out.println(transmitter.sendData(data, new HttpTransmissionStrategy()));
        System.out.println(transmitter.sendData(data, new MqttTransmissionStrategy()));
        System.out.println(transmitter.sendData(data, new WebSocketTransmissionStrategy()));

        System.out.println("\n=== Alert Trigger Strategy ===");
        AlertEvaluator evaluator = new AlertEvaluator();
        double sensorValue = 35.0;
        double threshold = 30.0;
        System.out.println("Threshold Alert: " + evaluator.evaluate(sensorValue, threshold, new ThresholdAlertStrategy()));

        RateOfChangeAlertStrategy rateStrategy = new RateOfChangeAlertStrategy();
        double sensorValueForFirstCall = 25.0;
        double sensorValueForSecondCall = 32.0;
        double thresholdForRate = 5.0;
        System.out.println("Rate of Change Alert (first call): " + rateStrategy.shouldTrigger(sensorValueForFirstCall,thresholdForRate)); // false
        System.out.println("Rate of Change Alert (second call): " + rateStrategy.shouldTrigger(sensorValueForSecondCall, thresholdForRate)); // true, jeśli różnica > 5
        double thresholdForStatistical = 20.0;
        System.out.println("Statistical Alert: " + evaluator.evaluate(sensorValue, thresholdForStatistical, new StatisticalAlertStrategy()));
                    }
}
//Koniec, Tydzień 6, Strategy Pattern
