package com.example.listycity;


/**
 * This is a class that defines a city
 *
 *
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    /**
     * Constructs a City object with the given name and province.
     *
     * @param city the name of the city
     * @param province the name of the province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the name of the city.
     *
     * @return the city name
     */
    String getCityName(){
        return this.city;
    }

    /**
     * Returns the name of the province the city belongs to.
     *
     * @return the province name
     */
    String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

    @Override
    public boolean equals(Object o) {
        City city1 = (City) o;
        return this.city.equals(city1.city) && this.province.equals(city1.province);

    }
}


