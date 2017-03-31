package com.cs.alf.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mikhail_alferov on 29.03.2017.
 */
public class Subject {
    private Integer state;
    private List<Observer> list = new ArrayList<>();

    public void attach(Observer observer){
        list.add(observer);
    }

    private void notifyAllObservers(){
        for (Observer observer : list) {
            observer.update();
        }

    }


    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
        notifyAllObservers();

    }
}
