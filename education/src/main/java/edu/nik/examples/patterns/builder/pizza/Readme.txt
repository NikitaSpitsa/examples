Enum Dough{THIN, HAND_TOSSED}

Pizza{
Dough dough;
List ingredients;
List sauces;
}

public class Main {
public static void main(String[] args) {
// Создаём пиццу pizza1 через билдер
Pizza pizza1 = new PizzaBuilder().addIngredient("tomato").addIngredient("mushrooms").addSauce("garlic").build();
// Создаём пиццу pizza2 через билдер
Pizza pizza2 = new PizzaBuilder().addIngredient("pineapple").addIngredient("Mozzarella").addSauce("cheese").addDough(HAND_TOSSED).build();

// Генерируем название и цену
String title = new PizzaTitleBuilder(pizza1).build();
String price = new PizzaPriceBuilder(pizza1).build();
// Создаём заказ из готовых строки и цены
Order order = new Order(title, price);
// Выводим заказ
System.out.println(order);
}
}

По умолчанию на тонком тесте. Если при вызове билдера указывать явно тесто - то тогда оно
В названии указывать "Х1-Х2 пицца на У-тесте". Соусы не должны быть в названии.
В цене считать и ингридиенты и соусы и тесто.

