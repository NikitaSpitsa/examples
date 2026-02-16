package edu.nik.examples.patterns.template_method.Order_Processor;

// Онлайн-заказ
class OnlineOrderProcessor {

    CreditCardService creditCardService = new CreditCardService();

    protected void processOrder(Order order) {
        // Проверяем, что в корзине нет запрещённых товаров, все есть в наличии
        if (order.items.isEmpty()) {
            throw new IllegalArgumentException("Order has no items!");
        }
        System.out.println("OnlineOrderProcessor: Order validated. Items in stock.");


        // Допустим, у нас акция: при покупке более 5 позиций скидка 10%
        double basePrice = order.items.size() * 10; // Пусть каждая позиция = 10 у.е.
        if (order.items.size() > 5) {
            basePrice *= 0.9;
        }
        order.totalPrice = basePrice;
        System.out.println("OnlineOrderProcessor: Price calculated = " + order.totalPrice);
        creditCardService.processPayment(order);

        if (!order.isPaid) {
            System.out.println("Order cannot be finalized. Payment not received.");
            return;
        }
        System.out.println("Order is finalized. Sending confirmation email.");

    }
