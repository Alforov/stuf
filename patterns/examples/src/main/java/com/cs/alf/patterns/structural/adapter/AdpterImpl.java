package com.cs.alf.patterns.structural.adapter;

/**
 * Created by mikhail_alferov on 03.04.2017.
 */
public class AdpterImpl implements Adapter {
    private Base base;

    public AdpterImpl() {
        this.base = new BaseImpl();
    }

    @Override
    public void doSmth() {
        base.doSmth();
    }
}
