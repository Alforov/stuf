package com.cs.alf.patterns.behavioral.visitor;

/**
 * Created by mikhail_alferov on 31.03.2017.
 */
public class Necessity implements Visitable {
    private double price;

    Necessity(double item) {
        price = item;
    }
    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }
}
