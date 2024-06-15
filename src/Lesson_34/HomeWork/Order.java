package Lesson_34.HomeWork;

import java.util.Objects;

public class Order {
    private int orderID;
    private String customerName;
    private   int amount;

    public Order(int orderID, String customerName, int amount) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.amount = amount;
    }

    public int getOrderID() {
        return orderID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", customerName='" + customerName + '\'' +
                ", amount=" + amount +
                '}';
    }


    public int compareTo(Order otherOrder) {
        int amountComparison = Double.compare(this.amount, otherOrder.amount);
        if (amountComparison != 0) {
            return amountComparison;
        }
        return this.customerName.compareTo(otherOrder.customerName);
    }
}
