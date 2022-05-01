package com.belhard.lesson10;

public class Address {
    private String city;
    private String street;
    private int house;
    private int apartment;

    public Address(String city, String street, int house, int apartment) {
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHouse() {
        return house;
    }

    public int getApartment() {
        return apartment;
    }
    public String displayInfo (){
        return  "г."+city +" ул."+ street +" д."+house+ " кв."+ apartment;
    }

}