package edu.nik.examples.patterns.builder.pizza;

public class PizzaTitleBuilder {
    private Pizza pizza;

    public PizzaTitleBuilder(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getTitle() {
        StringBuilder pizzaTitle = new StringBuilder();
        pizzaTitle.append(pizza.getPizzaName());
        pizzaTitle.append(pizza.getDough().getDescription());
        if (pizza.getIngredientsList() != null) {
            pizzaTitle.append(" with ingredients ");
            pizzaTitle.append(pizza.getIngredientsList());
        }
        return pizzaTitle.toString();

    }
}
