package ru.mirea.lab3.furniture;

public class FurnitureTester {
    public static void main(String[] args) {
        FurnitureShop ikea = new FurnitureShop("IKEA", "Sweden");

        ikea.addFurniture(new Chair("wood", "brown", 40));
        ikea.addFurniture(new Chair("plastic", "blue", 30));
        ikea.addFurniture(new Table("metal", "gray", 20));

        System.out.println(ikea.toString());
    }
}
