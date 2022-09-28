package ru.mirea.lab12;

import java.util.Scanner;

public class IntroExercice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input string: ");
        String string = scanner.nextLine();
        System.out.print("regex: ");
        String regex = scanner.nextLine();

        String[] splitting = string.split(regex);
        for (String str : splitting) {
            System.out.println(str);
        }

        scanner.close();
    }
}
