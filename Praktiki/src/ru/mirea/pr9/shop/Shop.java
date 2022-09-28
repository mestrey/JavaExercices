package ru.mirea.pr9.shop;

public class Shop {
    public void confirmOrder(String fullname, String TIN) {
        if (TIN.length() != 12)
            throw new IllegalArgumentException("TIN must consist of 12 digits");
    }
}
