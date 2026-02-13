package com.example.listycity;
/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;
    /**
     * Constructs a new City object.
     * @param
     * city the name of the city
     * @param
     * province the name of the province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    /**
     * Gets the city name
     * @return
     * the name of the city
     */
    String getCityName(){
        return this.city;
    }
    /**
     * Gets the province name
     * @return
     * the name of the province
     */
    String getProvinceName(){
        return this.province;
    }
    /**
     * Compares this city to another city
     * @param
     * o the city to compare to
     * @return
     * 0 if equal
     */
    @Override
    public int compareTo(City o) {
        return 0;
    }
}