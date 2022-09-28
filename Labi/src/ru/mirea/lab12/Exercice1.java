package ru.mirea.lab12;

import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter prices separated by comma");
        System.out.print("Input: ");

        String input = scanner.nextLine();
        String[] prices = input.split(",");

        for (String price : prices) {
            price = price.trim();
            if (price.matches("\\d+(\\.\\d+)?\\s+((EU)|(USD))"))
                System.out.println("Recognized price: " + price);
        }

        scanner.close();
    }
}
