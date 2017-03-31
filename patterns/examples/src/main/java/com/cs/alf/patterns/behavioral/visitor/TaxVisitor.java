package com.cs.alf.patterns.behavioral.visitor;

/**
 * Created by mikhail_alferov on 31.03.2017.
 */
import java.text.DecimalFormat;
import java.util.Locale;

class TaxVisitor implements Visitor {

    DecimalFormat df = new DecimalFormat("#.##");
    public TaxVisitor() {
    }

    public double visit(Liquor liquorItem) {
        System.out.println("Liquor Item: Price with Tax");
        return Double.parseDouble(df.format((liquorItem.getPrice() * .18) + liquorItem.getPrice()));
    }
    public double visit(Tobacco tobaccoItem) {
        System.out.println("Tobacco Item: Price with Tax");
        return Double.parseDouble(df.format((tobaccoItem.getPrice() * .32) + tobaccoItem.getPrice()));
    }
    public double visit(Necessity necessityItem) {
        System.out.println("Necessity Item: Price with Tax");
        return Double.parseDouble(df.format(necessityItem.getPrice()));
    }

}