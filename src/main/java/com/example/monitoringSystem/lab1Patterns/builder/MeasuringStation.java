package com.example.monitoringSystem.lab1Patterns.builder;

//Tydzień 2, Wzorzec Builder 1
//Builder pattern dla obiektów MeasuringStation - umożliwia etapowe budowanie obiektu
//Zapewnia czytelny i elastyczny sposób tworzenia złożonych obiektów
public class MeasuringStation {
    public String name;
    public String localization;

    private MeasuringStation(StationBuilder builder) {
        this.name = builder.name;
        this.localization = builder.localization;
    }

    public static class StationBuilder {
        private String name;
        private String localization;

        public StationBuilder(String name, String localization) {
            this.name = name;
            this.localization = localization;
        }        public MeasuringStation build() {
            return new MeasuringStation(this);
        }
    }
}
//Koniec, Tydzień 2, Wzorzec Builder 1