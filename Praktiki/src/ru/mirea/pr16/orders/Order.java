package ru.mirea.pr16.orders;

import ru.mirea.pr16.items.Item;

public interface Order {
    public boolean add(Item item);

    public boolean remove(String itemName);

    public boolean remove(Item item);

    public int removeAll(String itemName);

    public int getSize();

    public Item[] getItems();

    public int getCost();

    public int getItemQuantity(String name);

    public Item[] getSortedByCost();
}
