package org.example.patterns.adapter.duck_quack;

public class WildTurkey implements Turkey{

    public void gobble() {
        System.out.println("Gobble!");
    }

    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
