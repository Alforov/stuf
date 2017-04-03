package com.cs.alf.patterns.structural.facade;

/**
 * Created by mikhail_alferov on 03.04.2017.
 */
public class FacadeDemo {
    public static void main(String[] args) {
        PCFacade pcFacade = new PCFacade();
        pcFacade.start();
    }
}
