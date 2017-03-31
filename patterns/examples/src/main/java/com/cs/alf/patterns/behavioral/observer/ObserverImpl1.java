package com.cs.alf.patterns.behavioral.observer;

/**
 * Created by mikhail_alferov on 29.03.2017.
 */
public class ObserverImpl1 extends Observer {
    public ObserverImpl1(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("observerImpl1 updated. State is: "+ subject.getState());
    }
}
