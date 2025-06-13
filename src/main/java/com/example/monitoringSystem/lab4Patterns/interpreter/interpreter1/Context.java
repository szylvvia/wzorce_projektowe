package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter1;

import java.util.List;
import java.util.Map;

//Tydzień 5, Wzorzec Interpreter - kontekst zawierający dane pomiarowe
//Przechowuje zmienne środowiskowe i dane dla wyrażeń interpretera
//Udostępnia wartości dla operacji porównań w wyrażeniach logicznych
public class Context {
    private final Map<String, List<Double>> data;

    public Context(Map<String, List<Double>> data) {
        this.data = data;
    }

    public List<Double> getContext(String name) {
        return data.get(name);
    }

    public void addContext(String name, List<Double> value) {
        data.put(name, value);
    }

}
//Koniec, Tydzień 5, Wzorzec Interpreter - kontekst
