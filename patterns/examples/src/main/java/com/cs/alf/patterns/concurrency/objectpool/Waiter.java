package com.cs.alf.patterns.concurrency.objectpool;

/**
 * Created by mikhail_alferov on 06.04.2017.
 */
public class Waiter implements Runnable {
    @Override
    public void run() {
        while (true){
            serveTable();
        }
    }

    private void serveTable() {

    }
}
