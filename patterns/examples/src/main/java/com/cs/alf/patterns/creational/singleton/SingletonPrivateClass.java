package com.cs.alf.patterns.creational.singleton;

/**
 * Created by mikhail_alferov on 06.04.2017.
 */
public class SingletonPrivateClass {
    private SingletonPrivateClass() {
    }

    public SingletonPrivateClass getInstance() {
        return Creater.INSTANSE;
    }

    private static class Creater {
        private final static SingletonPrivateClass INSTANSE = new SingletonPrivateClass();

        private Creater() {
        }

    }
}
