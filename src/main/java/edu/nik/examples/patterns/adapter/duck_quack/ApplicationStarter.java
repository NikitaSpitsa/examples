package edu.nik.examples.patterns.adapter.duck_quack;

public class ApplicationStarter {

    public static void main(String[] args) {
        System.out.println("\n\n   Duck example \n \n");

        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says - ");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says - ");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says - ");
        testDuck(turkeyAdapter);

        System.out.println("\n\n   Duck example finished \n \n");
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
