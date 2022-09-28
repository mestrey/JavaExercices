package ru.mirea.lab3.furniture;

public class Table extends Furniture {
    public Table(String material, String color, int volume) {
        super(material, color, volume);
    }

    @Override
    public String toString() {
        return "Table [color=" + super.getColor() + ", material=" + super.getMaterial() + ", volume="
                + super.getVolume() + "]";
    }

    @Override
    public void mount() {
        System.out.println("Mounting table by starting with desk!");
    }
}
