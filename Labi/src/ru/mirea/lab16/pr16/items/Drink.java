package ru.mirea.lab16.pr16.items;

public final class Drink implements Item {
    private double cost;
    private String name;
    private String description;

    public Drink(String name, String description) {
        this.name = name;
        this.description = description;
        this.cost = 0;
    }

    public Drink(double cost, String name, String description) {
        if (cost < 0)
            throw new IllegalArgumentException();
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

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
