package com.cs.alf.patterns.structural.decorator;

/**
 * Created by mikhail_alferov on 03.04.2017.
 */
public class SportModeCarDecorator implements Car {
    private Car car;

    public SportModeCarDecorator(Car car) {
        this.car = car;
    }


    @Override
    public void getCarInfo() {
        car.getCarInfo();
        System.out.println(this.getClass().getName());
        System.out.println("sport kit is added to car !!!!!!");
    }
}
