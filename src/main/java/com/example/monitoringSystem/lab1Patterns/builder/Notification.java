package com.example.monitoringSystem.lab1Patterns.builder;

//Tydzień 2, Wzorzec Builder 2
//Builder dla powiadomień - pozwala na elastyczne tworzenie różnych typów notyfikacji
//Izoluje logikę konstrukcji obiektu od jego reprezentacji
public class Notification {
    private String message;

    private Notification(NotificationBuilder builder) {
        this.message = builder.message;
    }

    public static class NotificationBuilder {
        private String message;

        public NotificationBuilder(String message) {
            this.message = message;
        }

        public Notification build() {
            return new Notification(this);
        }
    }

    @Override
    public String toString() {
        return "Notification{" +
                "message='" + message + '\'' +                '}';
    }

}
//Koniec, Tydzień 2, Wzorzec Builder 2


