package edu.nik.examples.patterns.builder.pizza;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Pizza {
    private List<String> ingredientsList = new ArrayList<>();
    private List<String> saucesList = new ArrayList<>();
    private Dough dough;
    private String pizzaName;

    public Pizza() {
    }

}
