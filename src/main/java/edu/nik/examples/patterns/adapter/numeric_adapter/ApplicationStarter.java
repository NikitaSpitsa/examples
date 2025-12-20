package edu.nik.examples.patterns.adapter.numeric_adapter;

public class ApplicationStarter {
    public static void main(String[] args) {
        Original original = new Original();

        Adapter adapter = new Adapter(original);

        Client client = new Client(adapter);
        
        client.show();
    }
}
