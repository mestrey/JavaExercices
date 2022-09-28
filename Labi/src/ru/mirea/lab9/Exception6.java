package ru.mirea.lab9;

import java.util.Scanner;

public class Exception6 {
    public void getKey() {
        Scanner scanner = new Scanner(System.in);
        String key = "";
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
            throw new Exception("Key was set to an empty string");
        return "data for " + key;
    }
}
