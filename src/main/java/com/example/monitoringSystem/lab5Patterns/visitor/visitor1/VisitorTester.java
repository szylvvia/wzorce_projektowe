package com.example.monitoringSystem.lab5Patterns.visitor.visitor1;

public class VisitorTester {

    public static void main(String[] args) {

        StationVisitable [] stations = new StationVisitable[]{
                new CityStation(new String[][]{
                        {"0", "New York", "8419600", "789.4", "Good"},
                        {"1", "Los Angeles", "3980400", "503.0", "Moderate"},
                        {"2", "Chicago", "2716000", "227.3", "Unhealthy"}
                }),
                new ForestStation(new String[][]{
                        {"0", "FireWarning", "True"},
                        {"1", "FloodWarning", "False"},
                        {"2", "StormWarning", "True"},
                        {"3", "EarthquakeWarning", "False"}
                })
        };

        System.out.println("CITY DATA");
        System.out.println(((CityStation)stations[0]).getAllData());
        System.out.println("FOREST DATA");
        System.out.println(((ForestStation)stations[1]).getAllData());

        System.out.println("FULL DATA FOR CITY AND FOREST");
        System.out.println(concatCityAndFOrest(stations));
    }

    private static String concatCityAndFOrest(StationVisitable[] stations) {
       StationVisitor visitor = new CityVisitorImpl();
        StringBuilder json = new StringBuilder();
        for (StationVisitable station : stations) {
            json.append(station.accept(visitor));
        }
        return json.toString();
    }
}
