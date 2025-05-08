package com.example.monitoringSystem.lab4Patterns.command;

public class DataLoggingCommandTester {
    public static void main(String[] args) {
        DataLogger dataLogger = new DataLogger();
        DataLoggingInvoker invoker = new DataLoggingInvoker();

        Command startCmd = new StartLoggingCommand(dataLogger);
        Command stopCmd = new StopLoggingCommand(dataLogger);
        Command clearCmd = new ClearLogCommand(dataLogger);

        System.out.println("=== Data Logging Command Pattern Test ===");
        invoker.executeCommand(startCmd);
        invoker.executeCommand(stopCmd);
        invoker.executeCommand(clearCmd);
    }
}
