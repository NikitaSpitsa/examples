package edu.nik.examples.patterns.adapter.numeric_adapter;

public class Adapter implements ITarget {
    Original original;

    public Adapter(Original original) {
        this.original = original;
    }

    @Override
    public void clientDouble(double value) {
        original.OriginalDouble(value);
    }

    @Override
    public void clientInt(int value) {
        original.OriginalInt(value*2);
    }

    @Override
    public void clientChar(char value) {
        for (int i = 0; i < 5; i++){
           original.OriginalChar(value);
        }
    }
}
