package edu.nik.examples.patterns.template_method.Order_Processor;

class CreditCardService{

    protected void processPayment(Order order) {
        // Эмулируем онлайн-платёж
        System.out.println("OnlineOrderProcessor: Trying to charge credit card...");
        // Успешная оплата
        order.isPaid = true;
        System.out.println("OnlineOrderProcessor: Payment successful.");
    }

}