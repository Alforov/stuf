package com.cs.alf.patterns.behavioral.observer;

/**
 * Created by mikhail_alferov on 29.03.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.attach(new ObserverImpl1(subject));
        subject.attach(new ObserverImpl2(subject));
        subject.setState(1);
        System.out.println("------------------");
        subject.setState(2);

    }
}
