package ru.mirea.lab9;

import java.util.Scanner;

public class Exception8 {
    public void getKey() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.print("Enter key: ");
            String key = scanner.nextLine();

            try {
                printDetails(key);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals(""))
            throw new Exception("Key set to empty string");
        return "data for " + key;
    }
}
