package com.example.listycity;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 *
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city the object to add
     * @throws IllegalArgumentException if the city already exists in the list
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return Return the sorted list
     *
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Checks whether the given city exists in the list.
     *
     * @param city object to check
     * @return true if the city is present in the list, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }
    /**
     * Removes a city from the list if it exists.
     *
     * @param city the City object to remove
     * @throws IllegalArgumentException if the city does not exist in the list
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException("City not found in the list.");
        }
        cities.remove(city);

    }
    /**
     * Returns the total number of cities in the list.
     *
     * @return the number of cities currently stored
     */
    public int countCities() {
        return cities.size();
    }



}
