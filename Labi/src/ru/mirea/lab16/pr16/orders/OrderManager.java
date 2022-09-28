package ru.mirea.lab16.pr16.orders;

import java.util.ArrayList;
import java.util.HashMap;

import ru.mirea.lab16.pr16.utils.OrderAlreadyAddedException;

public class OrderManager {
    HashMap<String, Order> adressOrder;

    public void add(String adress, Order order) throws OrderAlreadyAddedException {
        if (adressOrder.get(adress) != null)
            throw new OrderAlreadyAddedException();
        adressOrder.put(adress, order);
    }

    public void get(String adress) {
        adressOrder.get(adress);
    }

    public void remove(String adress) {
        adressOrder.remove(adress);
    }

    public Order[] getInternetOrders() {
        ArrayList<Order> internetOrders = new ArrayList<Order>();
        for (Order order : adressOrder.values())
            if (order instanceof InternetOrder)
                internetOrders.add(order);
        return (Order[]) internetOrders.toArray();
    }

    public int getCost() {
        int result = 0;
        for (Order order : adressOrder.values())
            result += order.getCost();
        return result;
    }

    public int getOrdersQuantity() {
        return adressOrder.size();
    }
}
