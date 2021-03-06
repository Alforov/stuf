package com.cs.alf.patterns.behavioral.visitor;

import java.util.Locale;

/**
 * Created by mikhail_alferov on 31.03.2017.
 */
public class VisitorTest {
    static {
        Locale.setDefault(Locale.US);
    }
    public static void main(String[] args) {

    /*    TaxHolidayVisitor taxHolidayCalc = new TaxHolidayVisitor();*/
        TaxVisitor taxCalc = new TaxVisitor();
        Necessity milk = new Necessity(3.47);
        Liquor vodka = new Liquor(11.99);
        Tobacco cigars = new Tobacco(19.99);

        System.out.println(milk.accept(taxCalc) + "\n");
        System.out.println(vodka.accept(taxCalc) + "\n");
        System.out.println(cigars.accept(taxCalc) + "\n");

    /*    System.out.println("TAX HOLIDAY PRICES\n");

        System.out.println(milk.accept(taxHolidayCalc) + "\n");
        System.out.println(vodka.accept(taxHolidayCalc) + "\n");
        System.out.println(cigars.accept(taxHolidayCalc) + "\n");*/

    }
}