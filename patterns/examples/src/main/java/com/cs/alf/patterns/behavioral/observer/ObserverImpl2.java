package com.cs.alf.patterns.behavioral.observer;

/**
 * Created by mikhail_alferov on 29.03.2017.
 */
public class ObserverImpl2 extends Observer  {
    public ObserverImpl2(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("observerImpl2 updated State is: " + subject.getState());
    }
}
