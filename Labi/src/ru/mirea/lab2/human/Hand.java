package ru.mirea.lab2.human;

public class Hand {
    private int fingers;

    public Hand(int fingers) {
        this.fingers = fingers;
    }

    public int getFingers() {
        return this.fingers;
    }

    public void setFingers(int fingers) {
        this.fingers = fingers;
    }

    @Override
    public String toString() {
        return "{" +
                " fingers='" + fingers + "'" +
                "}";
    }
}
