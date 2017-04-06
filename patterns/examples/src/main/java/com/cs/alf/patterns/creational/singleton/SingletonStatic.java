package com.cs.alf.patterns.creational.singleton;

/**
 * Created by mikhail_alferov on 06.04.2017.
 */
public class SingletonStatic {
    private static final SingletonStatic INSTANCE = new SingletonStatic();
    private SingletonStatic() {
    }
    public static SingletonStatic getInstance(){
      return INSTANCE;
    }
}
