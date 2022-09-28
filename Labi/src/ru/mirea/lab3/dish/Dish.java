package ru.mirea.lab3.dish;

public abstract class Dish {
    private String name;
    private String location;
    private int kitchenID;

    public Dish(String name, String location, int kitchenID) {
        this.name = name;
        this.location = location;
        this.kitchenID = kitchenID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getKitchenID() {
        return this.kitchenID;
    }

    public void setKitchenID(int kitchenID) {
        this.kitchenID = kitchenID;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", location='" + getLocation() + "'" +
                ", kitchenID='" + getKitchenID() + "'" +
                "}";
    }
}
