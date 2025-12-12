package edu.nik.examples.patterns.adapter.duck_quack;

public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(WildTurkey turkey) {
        this.turkey = turkey;
    }

    public void quack(){
        turkey.gobble();
    }

    public void fly(){
        turkey.fly();
    }

}
