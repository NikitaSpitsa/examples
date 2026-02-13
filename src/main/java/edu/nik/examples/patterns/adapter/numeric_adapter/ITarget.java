package edu.nik.examples.patterns.adapter.numeric_adapter;

public interface ITarget {
    void clientDouble(double value);
    void clientInt(int value);
    void clientChar(char value);
}
