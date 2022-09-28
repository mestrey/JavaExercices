package ru.mirea.lab12;

import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter passwords separated by comma");
        System.out.print("Input: ");

        String input = scanner.nextLine();
        String[] passwords = input.split(",");

        boolean inputOk = true;

        for (String password : passwords) {
            password = password.trim();

            if (!password.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)^[\\w]{8,}$"))
                inputOk = false;
        }

        if (inputOk)
            System.out.println("Input ok!");
        else
            System.out.println("Input bad!");

        scanner.close();
    }
}
