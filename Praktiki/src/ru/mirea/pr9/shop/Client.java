package ru.mirea.pr9.shop;

import java.util.Scanner;

class Client {
    private String name;
    private String TIN;

    public void order(Shop shop) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Taxpayer Identification Number (TIN): ");
        TIN = scanner.nextLine();
        scanner.close();

        try {
            shop.confirmOrder(name, TIN);
        } catch (Exception e) {
            throw new ShopTINException("Incorrect TIN", e);
        }

        System.out.println("Order successfully completed");
    }
}