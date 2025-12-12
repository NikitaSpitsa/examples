package edu.nik.examples.patterns.builder.pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {

    List<String> ingredientsList =  new ArrayList<>();
    List<String> sauceList =  new ArrayList<>();
    String dough = Dough.THIN.getDescription();
    String pizzaName = "Classic Pizza";
    double pizzaPrice = 5.0;

    public PizzaBuilder addIngredient(String ingredientName){
        this.ingredientsList.add(ingredientName);
        return this;
    }

    public PizzaBuilder addSauce(String sauceName) {
        this.sauceList.add(sauceName);
        return this;
    }

    public PizzaBuilder chengeDough(Dough dough) {
        this.dough = dough.getDescription();
        pizzaPrice = pizzaPrice + 1.0;
        return this;
    }

    public PizzaBuilder pizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
        return this;
    }

    public PizzaBuilder pizzaPrice(double pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
        return this;
    }

    public Pizza build() {
        return new Pizza(this);
    }
}

