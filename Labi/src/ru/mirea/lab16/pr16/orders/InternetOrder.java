package ru.mirea.lab16.pr16.orders;

import java.util.Arrays;

import ru.mirea.lab16.Customer;
import ru.mirea.lab16.pr16.items.Item;
import ru.mirea.lab16.pr16.utils.QueueNode;

public class InternetOrder implements Order {
    private QueueNode<Item> head;
    private QueueNode<Item> tail;
    private int size = 0;
    private Customer customer;

    public InternetOrder() {
        head = new QueueNode<Item>(null, null, null);
    }

    public InternetOrder(Item[] items) {
        QueueNode<Item> node = head;
        for (Item item : items)
            if (node == null || node.getValue() == null)
                node = new QueueNode<Item>(null, null, items[0]);
            else {
                QueueNode<Item> newNode = new QueueNode<Item>(null, node, item);
                node.setNext(newNode);
                node = newNode;
            }
        size = items.length;
        tail = node;
    }

    public boolean add(Item item) {
        QueueNode<Item> node = new QueueNode<Item>(null, tail, item);
        tail.setNext(node);
        tail = node;
        size++;
        return true;
    }

    public boolean remove(String itemName) {
        QueueNode<Item> node = head;
        while (node != null) {
            if (node.getValue().getName() == itemName) {
                node.getPrev().setNext(node.getNext());
                size--;
                return true;
            }
            node = node.getNext();
        }
        return false;
    }

    public boolean remove(Item item) {
        return remove(item.getName());
    }

    public int removeAll(String itemName) {
        int result = 0;
        boolean rem = true;
        while (rem)
            rem = remove(itemName);
        return result;
    }

    public int getSize() {
        return size;
    }

    public Item[] getItems() {
        Item[] items = new Item[size];
        QueueNode<Item> node = head;

        for (int i = 0; i < items.length; i++) {
            items[i] = node.getValue();
            node.getNext();
        }

        return items;
    }

    public int getCost() {
        int result = 0;
        QueueNode<Item> node = head;

        while (node != null) {
            result += node.getValue().getCost();
            node = node.getNext();
        }

        return result;
    }

    public int getItemQuantity(String name) {
        int result = 0;
        QueueNode<Item> node = head;

        while (node != null) {
            if (name.equals(node.getValue().getName()))
                result++;
            node = node.getNext();
        }

        return result;
    }

    public Item[] getSortedByCost() {
        Item[] items = getItems();
        Arrays.sort(items, (a, b) -> a.getCost() < b.getCost() ? -1 : a.getCost() == b.getCost() ? 0 : 1);
        return items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
