package ru.mirea.lab3.furniture;

public abstract class Furniture {
    private String material;
    private String color;
    private int volume;

    public Furniture(String material, String color, int volume) {
        this.material = material;
        this.color = color;
        this.volume = volume;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public abstract String toString();

    public abstract void mount();
}
