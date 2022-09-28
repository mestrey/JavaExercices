package ru.mirea.lab3.furniture;

public class Chair extends Furniture {
    public Chair(String material, String color, int volume) {
        super(material, color, volume);
    }

    @Override
    public String toString() {
        return "Chair [color=" + super.getColor() + ", material=" + super.getMaterial() + ", volume="
                + super.getVolume() + "]";
    }

    @Override
    public void mount() {
        System.out.println("Mounting chair by starting with legs!");
    }
}
