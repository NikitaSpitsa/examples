package edu.nik.examples.patterns.template_method.Order_Processor;

public abstract class OrderProcessor {

    public final void processOrder(Order order){
        validateOrder(order);
        calculatePrice(order);
        processPayment(order);
        finalizeOrder(order);
    }

    protected abstract void validateOrder(Order order);
    protected abstract void calculatePrice(Order order);
    protected abstract void processPayment(Order order);
    protected abstract void finalizeOrder(Order order);
}
