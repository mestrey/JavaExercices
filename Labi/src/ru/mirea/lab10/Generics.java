package ru.mirea.lab10;

import java.util.ArrayList;
import java.util.Arrays;

public class Generics {
    public <T> ArrayList<T> toList(T[] array) {
        return new ArrayList<T>(Arrays.asList(array));
    }

    public <T> T getElementAt(T[] array, int index) {
        int i = 0;
        while (i < array.length) {
            if (i == index)
                return array[i];
            i++;
        }
        return null;
    }
}
