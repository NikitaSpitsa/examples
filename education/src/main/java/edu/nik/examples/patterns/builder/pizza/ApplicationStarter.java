package edu.nik.examples.patterns.builder.pizza;

import static edu.nik.examples.patterns.builder.pizza.Dough.HAND_TOSSED;
import static edu.nik.examples.patterns.builder.pizza.Dough.THIN;

public class ApplicationStarter {
    public  static void main(String[] args) {
        Pizza pizza1 = new PizzaBuilder().changeDough(HAND_TOSSED).addIngredient("tomato").addIngredient("tomato").addIngredient("mushrooms").addSauce("garlic").build();

        System.out.println("Your order is : ");
        System.out.println(new PizzaTitleBuilder(pizza1).getTitle() );
        System.out.println("For " + new  PizzaPriceBuilder(pizza1).getPrice() + " $ "  );

    }

}
