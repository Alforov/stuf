package com.cs.alf.patterns.creational.singleton;

/**
 * Created by mikhail_alferov on 06.04.2017.
 */
public class SingletonTwoPhaze {
    private static volatile SingletonTwoPhaze singleton;

    private SingletonTwoPhaze() {
    }

    public static SingletonTwoPhaze getInstance() {
        if (singleton == null) {
           synchronized (SingletonTwoPhaze.class){
               if(singleton == null){
                   singleton = new SingletonTwoPhaze();
               }
           }
        }
        return singleton;
    }

}
