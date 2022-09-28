package ru.mirea.lab9;

public class Exception5 {
    public void printMessage(String key) {
        String message = "";

        try {
            message = getDetails(key);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(message);
    }

    public String getDetails(String key) {
        if (key == null)
            throw new NullPointerException("null key in getDetails");
        return "data for " + key;
    }
}
