package com.cs.alf.patterns.behavioral.strategy;

/**
 * Created by mikhail_alferov on 03.04.2017.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void executeStrategy(int i, int j){
        strategy.doOperation(i, j);
    }
}
