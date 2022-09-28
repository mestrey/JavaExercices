package ru.mirea.lab1;

import java.util.Random;

public class Exe4RandSort {
    private static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < (a.length - i); j++) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    private static void display(int[] a) {
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++)
            array[i] = r.nextInt(99);

        display(array);
        sort(array);
        System.out.println("---");
        display(array);
    }
}
