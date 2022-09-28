package ru.mirea.lab2.human;

public class HumanTester {
    public static void main(String[] args) {
        Human human1 = new Human(
                new Head(120, "Brown"),
                new Hand(5),
                new Leg(50));

        Human human2 = new Human(
                new Head(120, "Brown"),
                new Hand(5),
                new Leg(50));

        System.out.println(human1.toString());
        System.out.println(human2.toString());
    }
}
