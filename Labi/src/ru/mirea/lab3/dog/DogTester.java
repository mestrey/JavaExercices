package ru.mirea.lab3.dog;

public class DogTester {
    public static void main(String[] args) {
        Pitbull pitbull = new Pitbull("Jacky", 8, 140);
        Beagle beagle = new Beagle("Chan", 10, 150);

        System.out.println(pitbull.canHunt());
        System.out.println(beagle.canHunt());
    }
}
