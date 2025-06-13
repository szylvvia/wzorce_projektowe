//Tydzień 7, Zasada SRP + Wzorzec Memento, tester systemu alertów z historią
//Demonstruje zastosowanie SRP w połączeniu z wzorcem Memento
//Testuje zapisywanie i przywracanie stanów alertów bez naruszania enkapsulacji
package com.example.monitoringSystem.lab6.srpMemento;

public class AlertMementoTester {
    public static void main(String[] args) {
        AlertSystem alertSystem = new AlertSystem();
        AlertCaretaker caretaker = new AlertCaretaker();

        System.out.println("=== Alert Memento Pattern Test ===");

        // Pierwszy alert
        alertSystem.triggerAlert("Temperature too high!");
        caretaker.save(alertSystem.saveToMemento());

        // Zapisz stan przed nadpisaniem kolejnym alertem
        caretaker.save(alertSystem.saveToMemento());
        alertSystem.triggerAlert("Humidity critical!");

        caretaker.save(alertSystem.saveToMemento());
        alertSystem.triggerAlert("Pressure dropping rapidly!");

        // Przywrócenie poprzedniego alertu
        System.out.println("\n--- Restoring previous alert ---");
        alertSystem.restoreFromMemento(caretaker.restore());

        // Przywrócenie jeszcze wcześniejszego alertu
        System.out.println("\n--- Restoring one more back ---");
        alertSystem.restoreFromMemento(caretaker.restore());
    }
}
//Koniec, Tydzień 7, Zasada SRP + Wzorzec Memento - tester

