package edu.nik.examples.patterns.builder.pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private List<String> ingredientsList = new ArrayList<>();
    private List<String> saucesList = new ArrayList<>();
    private String dough;
    private String pizzaName;
    private Double pizzaPrice;

    public Pizza(PizzaBuilder builder) {
        this.ingredientsList = builder.ingredientsList;
        this.saucesList = builder.sauceList;
        this.pizzaName = builder.pizzaName;
        this.pizzaPrice = builder.pizzaPrice;
        this.dough = builder.dough;
    }

    public String getName() {
        return pizzaName;
    }

    public double getPrice() {
        return pizzaPrice;
    }

    public String getDough() {
        return dough;
    }

    public List<String> getIngredients() {
        return ingredientsList;
    }

    public List<String> getSauces() {
        return saucesList;
    }
}
