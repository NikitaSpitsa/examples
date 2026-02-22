package edu.nik.examples.patterns.template_method.order_processor;

import java.util.Arrays;

public class OrderDemo {
    public static void main(String[] args) {
        Order onlineOrder = new Order(Arrays.asList("Pizza", "Salad", "Juice", "Pasta", "Soup", "Cake"));
        OrderProcessor onlineProcessor = new OnlineOrderProcessor();
        onlineProcessor.processOrder(onlineOrder);
        System.out.println();
        System.out.println("-----------------------");
        System.out.println();
        Order inStoreOrder = new Order(Arrays.asList("Pizza", "Coffee"));
        OrderProcessor inStoreProcessor = new InStoreOrderProcessor();
        inStoreProcessor.processOrder(inStoreOrder);
    }
}
