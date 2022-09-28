package ru.mirea.lab16.pr16.utils;

public class OrderAlreadyAddedException extends Exception {
    public String getMessage() {
        return "Order already added!";
    }
}
