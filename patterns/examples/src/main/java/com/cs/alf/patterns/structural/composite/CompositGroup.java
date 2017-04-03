package com.cs.alf.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mikhail_alferov on 03.04.2017.
 */
public class CompositGroup implements Composit {
    private List<Composit> list = new ArrayList();

    public void add(Composit composit) {
        list.add(composit);
    }

    public void remove(int index) {
        list.remove(index);
    }

    public Composit getChild(int index) {
        return list.get(index);
    }

    @Override
    public void doSmth() {
        for (Composit composit : list) {
            composit.doSmth();
        }
    }
}
