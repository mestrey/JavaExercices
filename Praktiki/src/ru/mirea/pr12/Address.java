package ru.mirea.pr12;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String flat;

    public Address(String address) {
        StringTokenizer tokenizer = new StringTokenizer(address, ",.;-");
        this.country = tokenizer.nextToken().trim();
        this.region = tokenizer.nextToken().trim();
        this.city = tokenizer.nextToken().trim();
        this.street = tokenizer.nextToken().trim();
        this.house = tokenizer.nextToken().trim();
        this.building = tokenizer.nextToken().trim();
        this.flat = tokenizer.nextToken().trim();
    }

    public void print() {
        System.out.println("county: " + country);
        System.out.println("region: " + region);
        System.out.println("city: " + city);
        System.out.println("street: " + street);
        System.out.println("house: " + house);
        System.out.println("building: " + building);
        System.out.println("flat: " + flat);
    }
}
