package edu.nik.examples.patterns.template_method.Order_Processor;

import java.util.List;

public class Order {
    List<String> items;
    double totalPrice;
    boolean isPaid;

    public Order(List<String> items) {
        this.items = items;
        this.totalPrice = 0;
        this.isPaid = false;
    }
}
