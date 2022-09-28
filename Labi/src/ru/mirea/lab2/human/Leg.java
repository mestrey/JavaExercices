package ru.mirea.lab2.human;

public class Leg {
    private int length;

    public Leg(int length) {
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "{" +
                " length='" + length + "'" +
                "}";
    }
}
