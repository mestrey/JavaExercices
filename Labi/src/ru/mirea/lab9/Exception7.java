package ru.mirea.lab9;

import java.util.Scanner;

public class Exception7 {
    public void getKey() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter key: ");
        String key = scanner.nextLine();
        printDetails(key);
        scanner.close();
    }

    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private String getDetails(String key) throws Exception {
        if (key.equals(""))
            throw new Exception("Key set to empty string");
        return "data for " + key;
    }
}
