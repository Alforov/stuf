package com.cs.alf.patterns.behavioral.strategy;

/**
 * Created by mikhail_alferov on 03.04.2017.
 */
public class AddStrategy  implements Strategy{
    @Override
    public void doOperation(int i, int j) {
        System.out.println("Summ is: " + (i+j));
    }
}
