package ru.mirea.lab1;

import java.util.Scanner;

public class Exe1Loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int arraySize = scan.nextInt();

        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            System.out.print(i + ": ");
            int userNum = scan.nextInt();
            array[i] = userNum;
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++)
            sum += array[i];

        System.out.println(sum);

        sum = 0;
        int count = 0;

        while (array.length > count) {
            sum += array[count];
            count++;
        }

        System.out.println(sum);

        sum = 0;
        count = 0;

        do {
            sum += array[count];
            count++;
        } while (array.length > count);

        System.out.println(sum);
        scan.close();
    }
}