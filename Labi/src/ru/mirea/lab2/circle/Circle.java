package ru.mirea.lab2.circle;

public class Circle {
    private int x, y;
    private double radius;
    private String color;

    public Circle(int x, int y, double radius, String color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "{" +
                " x='" + getX() + "'" +
                ", y='" + getY() + "'" +
                ", radius='" + getRadius() + "'" +
                ", color='" + getColor() + "'" +
                "}";
    }
}
