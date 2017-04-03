package com.cs.alf.patterns.structural.composite;

/**
 * Created by mikhail_alferov on 03.04.2017.
 */
public class CompositTest {

    public static void main(String[] args) {
        CompositGroup compositGroup = new CompositGroup();
        compositGroup.add(new CompositImpl());
        compositGroup.add(new CompositImpl());
        compositGroup.add(new CompositImpl());
        compositGroup.add(new CompositImpl());
        compositGroup.doSmth();
    }
}
