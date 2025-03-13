package com.example.monitoringSystem.builder;

public class Report {
    private String date;
    private String localization;
    private String name;
    private String stationName;
    private double pressure;
    private double temperature;
    private double humidity;

    private Report(ReportBuilder builder) {
        this.date = builder.date;
        this.localization = builder.localization;
        this.name = builder.name;
        this.stationName = builder.stationName;
        this.pressure = builder.pressure;
        this.temperature = builder.temperature;
        this.humidity = builder.humidity;
    }

    public static class ReportBuilder {
        private String date;
        private String localization;
        private String name;
        private String stationName;
        private double pressure;
        private double temperature;
        private double humidity;

        public ReportBuilder(String date, String localization, String name, String stationName) {
            this.date = date;
            this.localization = localization;
            this.name = name;
            this.stationName = stationName;
        }

        public ReportBuilder setPressure(double pressure) {
            this.pressure = pressure;
            return this;
        }

        public ReportBuilder setTemperature(double temperature) {
            this.temperature = temperature;
            return this;
        }

        public ReportBuilder setHumidity(double humidity) {
            this.humidity = humidity;
            return this;
        }

        public Report build() {
            return new Report(this);
        }
    }

    @Override
    public String toString() {
        return "Report{" +
                "date='" + date + '\'' +
                ", localization='" + localization + '\'' +
                ", name='" + name + '\'' +
                ", stationName='" + stationName + '\'' +
                ", pressure=" + pressure +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }

}
