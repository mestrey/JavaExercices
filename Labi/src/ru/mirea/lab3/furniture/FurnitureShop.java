package ru.mirea.lab3.furniture;

import java.util.ArrayList;

public class FurnitureShop {
    private String name;
    private String location;
    private ArrayList<Furniture> furnitures;

    public FurnitureShop(String name, String location) {
        this.name = name;
        this.location = location;
        this.furnitures = new ArrayList<Furniture>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Furniture> getFurnitures() {
        return furnitures;
    }

    public void setFurnitures(ArrayList<Furniture> furnitures) {
        this.furnitures = furnitures;
    }

    public void addFurniture(Furniture furniture) {
        furnitures.add(furniture);
    }

    @Override
    public String toString() {
        return "FurnitureShop [furnitures=" + furnitures + ", location=" + location + ", name=" + name + "]";
    }
}
