package ru.mirea.lab16.pr16.orders;

import java.util.ArrayList;

import ru.mirea.lab16.Customer;
import ru.mirea.lab16.pr16.items.Item;

public class RestaurantOrder implements Order {
    private Customer customer;
    private ArrayList<Item> items = new ArrayList<Item>();

    public boolean add(Item item) {
        items.add(item);
        return true;
    }

    public boolean remove(String itemName) {
        for (Item item : items)
            if (item.getName() == itemName) {
                items.remove(item);
                return true;
            }
        return false;
    }

    public boolean remove(Item item) {
        return items.remove(item);
    }

    public int removeAll(String itemName) {
        int result = 0;
        boolean rem = true;
        while (rem)
            rem = remove(itemName);
        return result;
    }

    public int getSize() {
        return items.size();
    }

    public Item[] getItems() {
        return (Item[]) items.toArray();
    }

    public int getCost() {
        int result = 0;
        for (Item item : items)
            result += item.getCost();
        return result;
    }

    public int getItemQuantity(String name) {
        int result = 0;
        for (Item item : items)
            if (item.getName().equals(name))
                result++;
        return result;
    }

    public Item[] getSortedByCost() {
        items.sort((a, b) -> a.getCost() < b.getCost() ? -1 : a.getCost() == b.getCost() ? 0 : 1);
        return (Item[]) items.toArray();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
