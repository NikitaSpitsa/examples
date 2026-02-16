package edu.nik.examples.patterns.template_method.Order_Processor;

// Офлайн-заказ (например, покупка в ресторане на месте)
class InStoreOrderProcessor extends OrderProcessor {

    protected void validateOrder(Order order) {
        // В офлайн-магазине — все на месте, можно просто проверить, что список товаров не пуст
        if (order.items.isEmpty()) {
            throw new IllegalArgumentException("Empty order!");
        }
        System.out.println("InStoreOrderProcessor: Order validated. Items ready.");
    }

    protected void calculatePrice(Order order) {
        // Допустим, в офлайне нет скидок за количество
        order.totalPrice = order.items.size() * 12; // каждая позиция стоит 12
        System.out.println("InStoreOrderProcessor: Price = " + order.totalPrice);
    }

    protected void processPayment(Order order) {
        // Ожидаем оплату на кассе
        System.out.println("InStoreOrderProcessor: Payment accepted at the counter.");
        order.isPaid = true;
    }

    protected void finalizeOrder(Order order) {
        // Базовая логика: если заказ оплачен, отправляем уведомление
        if (order.isPaid) {
            System.out.println("Order is finalized. Sending confirmation email.");
        } else {
            System.out.println("Order cannot be finalized. Payment not received.");
        }
    }
}
