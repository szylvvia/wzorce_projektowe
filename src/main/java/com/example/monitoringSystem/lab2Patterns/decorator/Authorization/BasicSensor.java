//Tydzień 3, Wzorzec Decorator - podstawowa implementacja sensora
//Konkretny komponent implementujący podstawową funkcjonalność pomiaru
//Może być dekorowany dodatkowymi funkcjami jak autoryzacja czy szyfrowanie
package com.example.monitoringSystem.lab2Patterns.decorator.Authorization;

public class BasicSensor implements SensorAuth {
    private final String name;

    public BasicSensor(String name) {
        this.name = name;
    }

    @Override
    public void measure() {
        System.out.println("Measuring data from sensor: " + name);
    }
}
//Koniec, Tydzień 3, Wzorzec Decorator - podstawowy sensor

