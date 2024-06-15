package Lesson_34.HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderService {
    private List<Order> orders;

    public OrderService() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public List<Order> findOrdersByCustomerName(String customerName) {
        List<Order> result = new ArrayList<>();
        for (Order order : orders) {
            if (order.getCustomerName().equalsIgnoreCase(customerName)) {
                result.add(order);
            }
        }
        return result;
    }

    public void sortOrdersByAmount() {
        Collections.sort(orders, Comparator.comparingDouble(Order::getAmount));
    }


    public void sortOrdersByCustomerName() {
        Collections.sort(orders, Comparator.comparing(Order::getCustomerName));
    }


    public void sortOrdersByAmountAndCustomerName() {
        Collections.sort(orders, Comparator.comparing(Order::getAmount));
    }

    public void displayOrders() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

}
