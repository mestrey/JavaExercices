package ru.mirea.lab3.dish;

public class Pan extends Dish {
    public Pan(String name, String location, int kitchenID) {
        super(name, location, kitchenID);
    }

    @Override
    public void setKitchenID(int kitchenID) {
        super.setKitchenID(kitchenID + 1);
    }
}
