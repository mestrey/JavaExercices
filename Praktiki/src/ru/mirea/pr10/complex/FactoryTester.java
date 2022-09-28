package ru.mirea.pr10.complex;

public class FactoryTester {
    public static void main(String[] args) {
        ConcreteFactory factory = new ConcreteFactory();
        Complex complex1 = factory.createComplex();
        Complex complex2 = factory.createComplex(4, -2);

        System.out.println(complex1);
        System.out.println(complex2);
    }
}
