package ru.mirea.lab7;

import java.util.ArrayList;

public class ArrayListTester {
    public static void main(String[] args) {
        ArrayList<Car> list = new ArrayList<Car>();

        list.add(new Car("BMW", "XS 6", 2004));
        list.add(0, new Car("Renault", "Scenic", 1995));
        list.add(new Car("Ferrari", "Urus", 2018));

        list.remove(2);

        System.out.println(list.get(0));
        System.out.println(list);
    }
}
