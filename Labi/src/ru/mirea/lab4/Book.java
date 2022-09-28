package ru.mirea.lab4;

import ru.mirea.lab4.interfaces.Nameable;
import ru.mirea.lab4.interfaces.Priceable;

public class Book implements Nameable, Priceable {
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
