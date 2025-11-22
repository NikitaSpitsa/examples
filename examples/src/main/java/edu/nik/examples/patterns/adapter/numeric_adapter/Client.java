package edu.nik.examples.patterns.adapter.numeric_adapter;

public class Client{

    ITarget client;

    public Client(ITarget adapter) {
        this.client = adapter;
    }

    void show(){
        client.clientDouble(88.8);
        client.clientInt(6);
        client.clientChar('z');
    }
}
