package ru.mirea.lab7;

import java.util.LinkedList;

public class LinkedListTester {
    public static void main(String[] args) {
        LinkedList<Car> list = new LinkedList<Car>();

        list.add(new Car("1", "model", 2000));
        list.addLast(new Car("2", "model", 2000));
        list.addFirst(new Car("3", "model", 2000));

        list.remove(2);

        System.out.println(list);
    }
}
