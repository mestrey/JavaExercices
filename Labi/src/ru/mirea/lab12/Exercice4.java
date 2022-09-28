package ru.mirea.lab12;

import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter emails separated by comma");
        System.out.print("Input: ");

        String input = scanner.nextLine();
        String[] emails = input.split(",");

        boolean inputOk = true;

        for (String email : emails) {
            email = email.trim();
            if (!email.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$"))
                inputOk = false;
        }

        if (inputOk)
            System.out.println("Input ok!");
        else
            System.out.println("Input bad!");

        scanner.close();
    }
}
