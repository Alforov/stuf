package com.cs.alf.patterns.behavioral.visitor;

/**
 * Created by mikhail_alferov on 31.03.2017.
 */
public class Liquor implements Visitable {
    private double price;

    Liquor(double item) {
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
