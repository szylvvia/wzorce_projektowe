//Tydzień 6, Wzorzec Visitor - tester drugiej implementacji
//Testuje funkcjonalność wzorca Visitor dla analizy danych ze stacji pomiarowych
//Demonstruje oddzielenie algorytmów od struktury danych przez wzorzec Visitor
package com.example.monitoringSystem.lab5Patterns.visitor.visitor2;

import java.util.Map;

public class VisitorTester2 {
    public static void main(String[] args) {
        DataAnalyzeVisitable [] stations = new DataAnalyzeVisitable[]{
                new UrbanStation("New York", Map.of("Temperature", 25.0, "Humidity", 60.0, "Air Quality", 50.0, "Pressure", 1012.0)),
                new SeaStation("Miami", "Atlantic Ocean", "35 ppt", Map.of("Temperature", 30.0, "Humidity", 95.0)),
                new UrbanStation("Los Angeles", Map.of("Temperature", 28.0, "Humidity", 55.0, "Air Quality", 45.0, "Pressure", 1015.0)),
                new SeaStation("San Francisco", "Pacific Ocean", "33 ppt", Map.of("Temperature", 18.0, "Salinity", 33.0)),
                new SeaStation("Seattle", "Pacific Ocean", "32 ppt", Map.of("Temperature", 15.0, "Salinity", 32.0)),
        };
        System.out.println("FIRST RECORD");
        System.out.println(((UrbanStation)stations[0]).getAllData());
        System.out.println("SECOND RECORD");
        System.out.println(((SeaStation)stations[1]).getAllData());
        System.out.println("FULL DATA FOR URBAN AND SEA");
        String totalData = createReports(stations);
        System.out.println(totalData);

    }

    private static String createReports(DataAnalyzeVisitable[] stations) {
        DataAnalyzeVisitor visitor = new DataAnalyzerImpl();
        StringBuilder json = new StringBuilder();
        for (DataAnalyzeVisitable station : stations) {
            json.append(station.accept(visitor));
        }
        return json.toString();
    }
}

//Koniec, Tydzień 6, Wzorzec Visitor - tester drugiej implementacji
