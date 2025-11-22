package edu.nik.examples.patterns.adapter.numeric_adapter;

public class Main {

    Original original = new Original();

    Adapter adapter = new Adapter(original);

    Client client= new Client(adapter);

    adapter.clientInt(7);
    client.clientInt(5);
    client.show();


}
