package edu.nik.examples.patterns.template_method.order_processor;

class CreditCardService {

    protected void processPayment(Order order) {
        // Эмулируем онлайн-платёж
        System.out.println("OnlineOrderProcessor: Trying to charge credit card...");
        // Успешная оплата
        order.setPaid(true);
        System.out.println("OnlineOrderProcessor: Payment successful.");
    }

}