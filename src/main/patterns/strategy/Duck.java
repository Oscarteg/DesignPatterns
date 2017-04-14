package main.patterns.strategy;

/**
 * Created by Oscar on 15/09/15.
 */
public abstract class Duck {
    public Duck() {
    }

    public void quack() {
        System.out.println("Duck.quack");
    }

    public void fly() {
        System.out.println("Duck.fly");
    }

    public void swim() {
        System.out.println("All ducks swim. Even fake ducks!");
    }

    abstract void display();
}