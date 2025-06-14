//Tydzień 6, Wzorzec Visitor - tester trzeciej implementacji visitora
//Testuje funkcjonalność wzorca Visitor dla systemu alertów krajowych i departamentalnych
//Demonstruje oddzielenie algorytmów raportowania od struktury danych administracyjnych
package com.example.monitoringSystem.lab5Patterns.visitor.visitor3;

public class VisitorTester3 {
    public static void main(String[] args) {

        AlertVisitable[] objects = new AlertVisitable[]{
            new Country("USA", "High", "Medium"),
            new Department("California", "Low"),
            new Country("Canada", "Medium", "Low"),
            new Department("Ontario", "High"),
            new Country("Mexico", "Low", "High"),
            new Department("Yucatan", "Medium")
        };

        System.out.println("FIRST RECORD");
        System.out.println(((Country)objects[0]).getAllData());
        System.out.println("SECOND RECORD");
        System.out.println(((Department)objects[1]).getAllData());

        System.out.println("FULL DATA FOR COUNTRY AND DEPARTMENT");
        String totalData = createReports(objects);
        System.out.println(totalData);
    }

    private static String createReports(AlertVisitable[] objects) {
        AlertImpl visitor = new AlertImpl();
        StringBuilder json = new StringBuilder();
        for (AlertVisitable object : objects) {
            json.append(object.accept(visitor));
        }
        return json.toString();
    }
}

//Koniec, Tydzień 6, Wzorzec Visitor - tester alertów
