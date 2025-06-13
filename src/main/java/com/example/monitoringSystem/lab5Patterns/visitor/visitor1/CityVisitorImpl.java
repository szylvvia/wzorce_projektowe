//Tydzień 6, Wzorzec Visitor - konkretna implementacja odwiedzającego
//Implementuje operacje wizytacji dla różnych typów stacji
//Generuje raporty JSON dla stacji miejskich i leśnych
package com.example.monitoringSystem.lab5Patterns.visitor.visitor1;

class CityVisitorImpl implements StationVisitor{

    @Override
    public String visit(CityStation cityStation) {
        //save to json
        StringBuilder json = new StringBuilder();
        json.append("{\n");
        json.append("\t\"CITY STATION REPORT\": [\n");
        for (int i = 0; i < cityStation.getDataSize(); i++) {
            json.append("\t{\n");
            json.append("\t\t\"Name\"-> \"").append(cityStation.getNameById(i)).append("\",\n");
            json.append("\t\t\"Population\"-> \"").append(cityStation.getPopulationById(i)).append("\",\n");
            json.append("\t\t\"Surface\"-> \"").append(cityStation.getSurfaceById(i)).append("\",\n");
            json.append("\t\t\"AirCondition\"-> \"").append(cityStation.getAirConditionById(i)).append("\"\n");
            json.append("\t}");
            if (i < cityStation.getDataSize() - 1) {
                json.append(",\n");
            }
        }
        json.append("\n\t]\n");
        json.append("}\n");
        return json.toString();
    }

    @Override
    public String visit(ForestStation forestStation) {
        //save to json
        StringBuilder json = new StringBuilder();
        json.append("{\n");
        json.append("\t\"FOREST STATION REPORT\": [\n");
        for (int i = 0; i < forestStation.getDataSize(); i++) {
            json.append("\t{\n");
            json.append("\t\t\"Type\": \"").append(forestStation.getTypeById(i)).append("\",\n");
            json.append("\t\t\"Value\": \"").append(forestStation.getValById(i)).append("\"\n");
            json.append("\t}");
            if (i < forestStation.getDataSize() - 1) {
                json.append(",\n");
            }
        }
        json.append("\n\t]\n");
        json.append("}");
        return json.toString();
    }
}

//Koniec, Tydzień 6, Wzorzec Visitor - implementacja odwiedzającego
