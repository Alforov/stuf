package com.cs.alf.patterns.structural.decorator;

/**
 * Created by mikhail_alferov on 03.04.2017.
 */
class CoolColorCarDecorator extends SportModeCarDecorator {

    public CoolColorCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void getCarInfo() {
       super.getCarInfo();
        setCoolColor();
    }

    private void setCoolColor() {
        System.out.println("Cool color is added");
    }

}
