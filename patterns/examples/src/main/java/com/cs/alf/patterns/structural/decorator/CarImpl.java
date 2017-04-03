package com.cs.alf.patterns.structural.decorator;

/**
 * Created by mikhail_alferov on 03.04.2017.
 */
public class CarImpl implements Car {
    @Override
    public void getCarInfo() {
        System.out.println("car with standart edition");
    }
}
