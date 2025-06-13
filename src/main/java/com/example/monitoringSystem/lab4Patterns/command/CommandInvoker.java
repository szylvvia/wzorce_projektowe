//Tydzień 5, Wzorzec Command - klasa Invoker zarządzająca komendami
//Odpowiada za wykonywanie komend i prowadzenie historii wykonanych operacji
//Umożliwia kolejkowanie, logowanie i potencjalne cofanie komend w systemie pomiarowym
package com.example.monitoringSystem.lab4Patterns.command;

import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {
    private List<Command> commandHistory = new ArrayList<>();

    public void executeCommand(Command command) {
        command.execute();
        commandHistory.add(command);
    }
}
//Koniec, Tydzień 5, Wzorzec Command - Invoker
