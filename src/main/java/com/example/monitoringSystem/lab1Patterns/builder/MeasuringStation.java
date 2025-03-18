package com.example.monitoringSystem.lab1Patterns.builder;

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
        }

        public MeasuringStation build() {
            return new MeasuringStation(this);
        }
    }
}