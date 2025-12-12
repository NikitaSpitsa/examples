package edu.nik.examples.patterns.builder.pizza;

public class PizzaTitleBuilder {
    private Pizza pizza;

    public PizzaTitleBuilder(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getTitle() {
        StringBuffer pizzaTitle = new StringBuffer();
        pizzaTitle.append(pizza.getName());
        pizzaTitle.append(pizza.getDough());
        if (pizza.getIngredients() != null) {
            pizzaTitle.append(" with ingredients ");
            pizzaTitle.append(pizza.getIngredients());
        }
        return pizzaTitle.toString();

    }
}
