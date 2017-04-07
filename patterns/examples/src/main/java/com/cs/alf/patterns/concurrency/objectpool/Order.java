package com.cs.alf.patterns.concurrency.objectpool;

/**
 * Created by mikhail_alferov on 07.04.2017.
 */
public class Order {
    private String first;
    private String second;
    private String compot;


    public Order(String first, String second, String compot) {
        this.first = first;
        this.second = second;
        this.compot = compot;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getCompot() {
        return compot;
    }

    public void setCompot(String compot) {
        this.compot = compot;
    }
}
