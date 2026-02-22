package edu.nik.examples.patterns.template_method.order_processor;

// Онлайн-заказ
class OnlineOrderProcessor extends OrderProcessor {

    CreditCardService creditCardService = new CreditCardService();

    protected void calculatePrice(Order order) {
        // Допустим, у нас акция: при покупке более 5 позиций скидка 10%
        double basePrice = order.items.size() * 10; // Пусть каждая позиция = 10 у.е.
        if (order.items.size() > 5) {
            basePrice *= 0.9;
        }
        order.totalPrice = basePrice;
        System.out.println("OnlineOrderProcessor: Price calculated = " + order.totalPrice);
    }

    protected void processPayment(Order order) {
        creditCardService.processPayment(order);
    }

    protected void finalizeOrder(Order order) {

        if (!order.isPaid) {
            System.out.println("Order cannot be finalized. Payment not received.");
            return;
        }
        System.out.println("Order is finalized. Sending confirmation email.");
    }


}
