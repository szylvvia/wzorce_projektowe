package com.example.monitoringSystem.lab1Patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class CountryPrototype implements Cloneable {
    private List<City> listCities;

    public CountryPrototype(){
        listCities = new ArrayList<City>();
    }

    public CountryPrototype(List<City> listCities){
        this.listCities = listCities;
    }

    public void loadData(){
        int populationInWarsaw = 1790658;
        int populationInKrakow = 779115;
        int populationInLodz = 679941;

        listCities.add(new City("Warszawa", populationInWarsaw, true));
        listCities.add(new City("Kraków", populationInKrakow, false));
        listCities.add(new City("Łódź", populationInLodz, false));
    }

    public List<City> getListCities() {
        return listCities;
    }


    @Override
    public Object clone() {
        List<City> temp = new ArrayList<City>();
        for(City city : listCities){
            temp.add(city);
        }
        return new CountryPrototype(temp);
    }

}
