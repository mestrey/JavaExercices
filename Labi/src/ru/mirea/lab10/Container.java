package ru.mirea.lab10;

import java.util.ArrayList;

public class Container<T> {
    private ArrayList<T> array = new ArrayList<T>();

    void add(T element) {
        array.add(element);
    }
}
