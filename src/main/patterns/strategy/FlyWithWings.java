package main.patterns.strategy;

import StrategyPattern.FlyBehavior;

/**
 * Created by Oscar on 15/09/15.
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can fly, watch me !");
    }
}
