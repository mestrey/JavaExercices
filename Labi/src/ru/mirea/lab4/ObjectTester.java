package ru.mirea.lab4;

import ru.mirea.lab4.interfaces.Nameable;
import ru.mirea.lab4.interfaces.Priceable;

public class ObjectTester {
    public static void main(String[] args) {
        Nameable dog = new Dog("Jacky", 10);

        System.out.println("Dog name: " + dog.getName());
        System.out.println("Dog age: " + ((Dog) dog).getAge());

        Priceable car = new Car("4x4 Pro", 1500000);

        System.out.println("Car price: " + car.getPrice());
        System.out.println("Car model: " + ((Car) car).getModel());

        Book book = new Book("War and Peace", 300);

        System.out.println("Book name: " + ((Nameable) book).getName());
        System.out.println("Book price: " + ((Priceable) book).getPrice());
    }
}
