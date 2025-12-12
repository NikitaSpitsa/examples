//package edu.nik.examples.patterns.builder.pizza.temp;
//
//public class PizzaPriceBuilder {
//    private Pizzabb pizza;
//    private final int ingredientPrice = 2;
//    private final int saucePrice = 1;
//    private final int thinDoughPrice = 5;
//    private final int handTossedDoughPrice = 7;
//
//    public PizzaPriceBuilder(Pizzabb pizza) {
//        this.pizza = pizza;
//    }
//
//    public String build() {
//        int total = 0;
//        total += pizza.ingredients.size() * ingredientPrice;
//        total += pizza.sauces.size() * saucePrice;
//        total += pizza.dough == Dough.THIN ? thinDoughPrice : handTossedDoughPrice;
//        return String.valueOf(total);
//    }
//}
