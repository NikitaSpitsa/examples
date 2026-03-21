package edu.nik.examples.patterns.template_method.order_processor;

// Офлайн-заказ (например, покупка в ресторане на месте)
class InStoreOrderProcessor extends OrderProcessor {
    public InStoreOrderProcessor() {
        super.orderProcessorName = "InStoreOrderProcessor";
    }

    public static final int PRICE_PER_ITEM = 12;

    protected void calculatePrice(Order order) {
        // Допустим, в офлайне нет скидок за количество
        order.setTotalPrice(order.getItems().size() * PRICE_PER_ITEM);// каждая позиция стоит 12
        System.out.println(orderProcessorName + ": Price = " + order.getTotalPrice());
    }

    protected void processPayment(Order order) {
        // Ожидаем оплату на кассе
        System.out.println(orderProcessorName + ": Payment accepted at the counter.");
        order.setPaid(true);
    }

    protected void finalizeOrder(Order order) {
        // Базовая логика: если заказ оплачен, отправляем уведомление
        if (order.getIsPaid()) {
            System.out.println("Order is finalized. Sending confirmation email.");
        } else {
            System.out.println("Order cannot be finalized. Payment not received.");
        }
    }
}
