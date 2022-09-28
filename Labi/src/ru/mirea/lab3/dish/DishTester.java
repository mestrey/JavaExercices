package ru.mirea.lab3.dish;

public class DishTester {
    public static void main(String[] args) {
        Stove stove = new Stove("Tefal", "Paris", 3);
        Dish dish = new Pan("myPan", "Moscow", 2);

        System.out.println(stove.toString());
        System.out.println(dish.toString());

        dish.setKitchenID(3);

        System.out.println(dish.toString());
    }
}
