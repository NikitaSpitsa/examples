package edu.nik.examples.patterns.builder.pizza;

import java.util.ArrayList;
import java.util.List;

import static edu.nik.examples.patterns.builder.pizza.Dough.HAND_TOSSED;
import static edu.nik.examples.patterns.builder.pizza.Dough.THIN;

public class PizzaBuilder {

    private List<String> ingredientsList =  new ArrayList<>();
    private List<String> sauceList =  new ArrayList<>();
    private Dough dough = THIN;
    private String pizzaName = "Classic Pizza";

    public PizzaBuilder addIngredient(String ingredientName){
        this.ingredientsList.add(ingredientName);
        return this;
    }

    public PizzaBuilder addSauce(String sauceName) {
        this.sauceList.add(sauceName);
        return this;
    }

    public PizzaBuilder changeDough(Dough dough) {
        this.dough = dough;
        return this;
    }

    public PizzaBuilder pizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
        return this;
    }

    public Pizza build() {
        Pizza pizza = new Pizza();
        pizza.setPizzaName(pizzaName);
        pizza.setIngredientsList(ingredientsList);
        pizza.setSaucesList(sauceList);
        pizza.setDough(dough);
        return pizza;
    }
}

