package com.cs.alf.patterns.structural.composite;

/**
 * Created by mikhail_alferov on 03.04.2017.
 */
public class CompositImpl implements Composit {
    @Override
    public void doSmth() {
        System.out.println("composit impl " + this.hashCode());
    }
}
