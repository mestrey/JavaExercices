package ru.mirea.pr1;

public class TestBall {
    public static void main(String[] args) {
        Ball d1 = new Ball("Adidas", 80);
        Ball d2 = new Ball("Nike", 30);
        Ball d3 = new Ball("China");

        d3.setSize(70);

        System.out.println(d1);

        d1.shoot();
        d2.shoot();
        d3.shoot();
    }
}
