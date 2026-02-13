package edu.nik.examples.patterns.builder.pizza;

import lombok.Getter;

@Getter
public enum Dough {
    THIN(" on the thin dough"),
    HAND_TOSSED(" on the hand tossed dough");

    private String description;

    Dough(String description) {
        this.description = description;
    }
}
