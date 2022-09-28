package ru.mirea.lab3.dish;

public class Stove extends Dish {
    public Stove(String name, String location, int kitchenID) {
        super(name, location, kitchenID);
    }

    @Override
    public String getName() {
        return super.getName() + " (Dish, Stove)";
    }
}
