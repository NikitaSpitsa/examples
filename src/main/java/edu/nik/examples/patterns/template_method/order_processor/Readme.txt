Классы OnlineOrderProcessor и InStoreOrderProcessor реализуют разные логики расчёта цены и способов оплаты.

Пример кода:

class Order {
    List<String> items;
    double totalPrice;
    boolean isPaid;

public Order(List<String> items) {
        this.items = items;
        this.totalPrice = 0;
        this.isPaid = false;
    }
}

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

class CreditCardService{

   protected void processPayment(Order order) {
        // Эмулируем онлайн-платёж
        System.out.println("OnlineOrderProcessor: Trying to charge credit card...");
        // Успешная оплата
        order.isPaid = true;
        System.out.println("OnlineOrderProcessor: Payment successful.");
    }

}
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
