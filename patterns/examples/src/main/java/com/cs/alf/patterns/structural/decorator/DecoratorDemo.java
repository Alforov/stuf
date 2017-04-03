package com.cs.alf.patterns.structural.decorator;

/**
 * Created by mikhail_alferov on 03.04.2017.
 */
public class DecoratorDemo {

    public static void main(String[] args) {
        CarImpl car = new CarImpl();
        SportModeCarDecorator sportModeCarDecorator = new SportModeCarDecorator(car);
        CoolColorCarDecorator coolColorCarDecorator = new CoolColorCarDecorator(sportModeCarDecorator);
        coolColorCarDecorator.getCarInfo();

    }
}
