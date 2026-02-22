package edu.nik.examples.patterns.template_method.order_processor;

import java.util.List;


public class Order {

    private List<String> items;
    private double totalPrice;
    private boolean isPaid;


    public void setItems(List<String> items) {
        this.items = items;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public List<String> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public boolean getIsPaid() {
        return isPaid;
    }

    public Order(List<String> items) {
        this.items = items;
        this.totalPrice = 0;
        this.isPaid = false;
    }
}
