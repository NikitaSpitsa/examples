package edu.nik.examples.patterns.builder.pizza;

import java.util.List;

public class PizzaNameBuilder extends Pizza {
    Pizza pizza;

    public PizzaNameBuilder(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getName (){
        StringBuffer name = new StringBuffer();
        name.append(pizza.description);
        name.append(pizza.getDough());

        return name.toString();
    }
}
