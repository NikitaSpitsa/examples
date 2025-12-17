package edu.nik.examples.patterns.builder.pizza;

public class PizzaPriceBuilder{
    Pizza pizza;

    private int ingredientPrice = 1;
    private int saucePrice = 1;
    private double basePizzaPrice = 5.0;


    public PizzaPriceBuilder(Pizza pizza) {
        this.pizza = pizza;
    }

    public double getPrice() {
        double price = basePizzaPrice;

        if (pizza.getDough() == Dough.THIN) {
            price = price + 2.0;
        } else {
            price = price + 1.0;
        }


        price = price + pizza.getIngredientsList().size() * ingredientPrice;

        price = price + pizza.getSaucesList().size() * saucePrice;

        return price;
    }
}
