package ru.mirea.lab2.human;

public class Head {
    private int iq;
    private String hairColor;

    public Head(int iq, String hairColor) {
        this.iq = iq;
        this.hairColor = hairColor;
    }

    public int getIq() {
        return this.iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public String getHairColor() {
        return this.hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "{" +
                " iq='" + iq + "'" +
                ", hairColor='" + hairColor + "'" +
                "}";
    }
}
