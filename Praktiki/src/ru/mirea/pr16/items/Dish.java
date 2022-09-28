package ru.mirea.pr16.items;

public final class Dish implements Item {
    private double cost;
    private String name;
    private String description;

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
