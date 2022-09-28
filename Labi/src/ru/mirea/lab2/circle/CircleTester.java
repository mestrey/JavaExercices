package ru.mirea.lab2.circle;

public class CircleTester {
    public static void main(String[] args) {
        Circle c1 = new Circle(3, 4, 45, "RED");
        Circle c2 = new Circle(4, 56, 26, "BLUE");

        System.out.println(c1.toString());

        c1.setX(73);
        c1.setColor("GREEN");

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
