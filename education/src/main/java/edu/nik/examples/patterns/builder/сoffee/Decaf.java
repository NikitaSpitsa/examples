package edu.nik.examples.patterns.builder.Coffee;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    public double cost() {
        return 1.05;
    }
}
