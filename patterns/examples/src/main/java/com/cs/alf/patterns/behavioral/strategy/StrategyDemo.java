package com.cs.alf.patterns.behavioral.strategy;

/**
 * Created by mikhail_alferov on 03.04.2017.
 */
public class StrategyDemo {
    public static void main(String[] args) {
        Context add = new Context(new AddStrategy());
        Context subtract = new Context(new SubtractStrategy());
        add.executeStrategy(1,2);
        subtract.executeStrategy(1,2);
    }
}
