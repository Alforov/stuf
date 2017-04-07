package com.cs.alf.patterns.concurrency.objectpool;

import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by mikhail_alferov on 06.04.2017.
 */
public class Waiter extends Thread {
    private AtomicBoolean isFree = new AtomicBoolean(true);
    private Order order;
    private String secondName;

    public Waiter(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        while (true) {
            serveTable();
        }
    }


    public boolean isFree() {
        return isFree.get();
    }

    public boolean setOrderIfFree(Order order) {
        if (isFree()) {
            this.order = order;
            return true;
        } else return false;
    }

    private void serveTable() {
        if (order == null) {
            isFree.set(true);
            return;
        }
        isFree.set(false);
        System.out.printf("%s start to serve..\n", secondName);
        Random random = new Random();
        try {
            Thread.sleep((random.nextInt(10) * 1000));
            System.out.printf("%s bring first %s \n", secondName, order.getFirst());
            Thread.sleep((random.nextInt(10) * 1000));
            System.out.printf("%s bring second %s \n", secondName, order.getSecond());
            Thread.sleep((random.nextInt(10) * 1000));
            System.out.printf("%s bring compot %s \n", secondName, order.getCompot());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        order = null;
        System.out.printf("%s stop to serve..\n", secondName);
        isFree.set(true);
    }

}
