package ru.mirea.lab9;

import java.util.Scanner;

public class Exception3 {
    public void exceptionDemo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String str = scanner.next();

        try {
            int i = Integer.parseInt(str);
            System.out.println(2 / i);
        } catch (Exception e) {
            System.out.println("An exception occurred.");
        }

        scanner.close();
    }
}
