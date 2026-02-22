package edu.nik.examples.patterns.template_method.order_processor;

public abstract class OrderProcessor {

    protected String orderProcessorName;

    public final void processOrder(Order order) {
        validateOrder(order);
        calculatePrice(order);
        processPayment(order);
        finalizeOrder(order);
    }

    protected void validateOrder(Order order) {

        // Проверяем, что в корзине нет запрещённых товаров, все есть в наличии
        if (order.getItems().isEmpty()) {
            throw new IllegalArgumentException("Order has no items!");
        }
        System.out.println(orderProcessorName + ": Order validated. Items in stock.");
    }

    protected abstract void calculatePrice(Order order);

    protected abstract void processPayment(Order order);

    protected abstract void finalizeOrder(Order order);
}
