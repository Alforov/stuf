package com.cs.alf.patterns.concurrency.objectpool;

import java.util.Random;

/**
 * Created by mikhail_alferov on 07.04.2017.
 */
public class Test {
    public static void main(String[] args) {
        Waiter petrov = new Waiter("Petrov");
        Waiter ivanov = new Waiter("Ivanov");
        Restorante restorante = new Restorante();
        restorante.getWaiters().add(petrov);
        restorante.getWaiters().add(ivanov);
        restorante.start();
        try {
            Thread.sleep(2_000);
            while (true) {
                Table freeTable = restorante.getFreeTable();
                if (freeTable != null) {
                    freeTable.setCurrentOrder(new Order("soup", "spageti", "tea"));
                    Random random = new Random();
                    Thread.sleep(1000 * random.nextInt(5));
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
