package com.cs.alf.patterns.behavioral.observer;

/**
 * Created by mikhail_alferov on 29.03.2017.
 */
public abstract class Observer {
    public Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
    }
    public abstract void update();
}
