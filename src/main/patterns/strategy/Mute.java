package main.patterns.strategy;

/**
 * Created by Oscar on 15/09/15.
 */
public class Mute  implements QuackBehavoir{
    @Override
    public void quack() {
        System.out.println("*Silence*");
    }
}
