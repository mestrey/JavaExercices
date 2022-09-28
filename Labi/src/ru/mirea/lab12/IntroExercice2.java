package ru.mirea.lab12;

import java.util.Scanner;

public class IntroExercice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input string: ");
        String string = scanner.nextLine();

        if (string.matches("abcdefghijklmnopqrstuv18340"))
            System.out.println("good");
        else
            System.out.println("bad");

        scanner.close();
    }
}
