package com.example.monitoringSystem.lab1Patterns.prototype;

//Tydzień 2, Wzorzec Prototype 2
//Prototype stacji pomiarowej - umożliwia klonowanie stacji z zachowaniem konfiguracji
//Przydatne przy tworzeniu wielu podobnych stacji z drobnymi modyfikacjami
public class MeasuringStationP implements Cloneable {
    private String name;
    private String localization;

    public MeasuringStationP(String name, String localization) {
        this.name = name;
        this.localization = localization;
    }

    // Clone method to implement the Prototype pattern
    @Override
    public MeasuringStationP clone() {
        try {
            return (MeasuringStationP) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported", e);
        }
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public String getName() {
        return name;
    }

    public String getLocalization() {
        return localization;
    }
    @Override
    public String toString() {
        return "MeasuringStation{Name='" + name + "', Localization='" + localization + "'}";
    }

}
//Koniec, Tydzień 2, Wzorzec Prototype 2


