//package edu.nik.examples.patterns.builder.pizza.temp;
//
//public class PizzaTitleBuilder {
//    private Pizzabb pizza;
//
//    public PizzaTitleBuilder(Pizzabb pizza) {
//        this.pizza = pizza;
//    }
//
//    public String build() {
//        String doughName = pizza.dough == Dough.THIN ? "тонком" : "hand-tossed";
//        if (pizza.ingredients.isEmpty()) {
//            return "Пицца на " + doughName + " тесте";
//        } else if (pizza.ingredients.size() == 1) {
//            return pizza.ingredients.get(0) + " пицца на " + doughName + " тесте";
//        } else {
//            return pizza.ingredients.get(0) + "-" + pizza.ingredients.get(1) + " пицца на " + doughName + " тесте";
//        }
//    }
//}
