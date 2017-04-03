package com.cs.alf.patterns.structural.facade;

/**
 * Created by mikhail_alferov on 03.04.2017.
 */
public class CPU implements Start {
    @Override
    public void start() {
        System.out.println("CPU started");
    }
}
