package com.example.monitoringSystem.lab4Patterns.command;

//Tydzień 5, Wzorzec Command 1
//Command pattern dla logowania danych - enkapsuluje żądania jako obiekty
//Umożliwia parametryzację obiektów z różnymi żądaniami, kolejkowanie i logowanie operacji
public class DataLoggingCommandTester {
    public static void main(String[] args) {
        DataLogger dataLogger = new DataLogger();
        DataLoggingInvoker invoker = new DataLoggingInvoker();

        Command startCmd = new StartLoggingCommand(dataLogger);
        Command stopCmd = new StopLoggingCommand(dataLogger);
        Command clearCmd = new ClearLogCommand(dataLogger);

        System.out.println("=== Data Logging Command Pattern Test ===");        invoker.executeCommand(startCmd);
        invoker.executeCommand(stopCmd);
        invoker.executeCommand(clearCmd);
    }
}
//Koniec, Tydzień 5, Wzorzec Command 1
