package edu.nik.examples.patterns.builder.pizza;

public class PizzaPriceBuilder{
    Pizza pizza;

    private int ingredientPrice = 1;
    private int saucePrice = 1;


    public PizzaPriceBuilder(Pizza pizza) {
        this.pizza = pizza;
    }

    public double getPrice() {
        double price = pizza.getPrice();

        price = price + pizza.getIngredients().size() * ingredientPrice;

        price = price + pizza.getSauces().size() * saucePrice;

        return price;
    }
}
