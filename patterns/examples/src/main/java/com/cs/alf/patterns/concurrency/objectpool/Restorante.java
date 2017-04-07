package com.cs.alf.patterns.concurrency.objectpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by mikhail_alferov on 06.04.2017.
 */
public class Restorante extends Thread {
    private List<Waiter> waiters = new CopyOnWriteArrayList<>();
    private List<Table> tables = new ArrayList<>();


    public Restorante() {
        tables.add(new Table("TableN1"));
        tables.add(new Table("TableN2"));
        tables.add(new Table("TableN3"));
    }

    public Table getFreeTable() {
        for (Table table : tables) {
            if (table.getCurrentOrder() == null) {
                return table;
            }
        }
        return null;
    }

    public List<Waiter> getWaiters() {
        return waiters;
    }

    public void setWaiters(List<Waiter> waiters) {
        this.waiters = waiters;
    }

    public void addWaiter(Waiter waiter) {
        waiters.add(waiter);
    }

    private void checkTables() {
        for (Table table : tables) {
            if (table.getCurrentOrder() != null) {
                Waiter waiter = getFreeWaiter();
                if (waiter != null) waiter.setOrder(table.getCurrentOrder());
            }
        }

    }

    private Waiter getFreeWaiter() {
        for (Waiter waiter : waiters) {
            if (waiter.isFree()) return waiter;
        }
        return null;
    }

    @Override
    public void run() {
        System.out.println("restoran opened...");
        for (Waiter waiter : waiters) {
            waiter.start();
            System.out.printf("waiter %s willing to work \n", waiter.getSecondName());
        }
        while (true) {
            checkTables();
        }
        //System.out.println("restoran closed...");
    }

}
