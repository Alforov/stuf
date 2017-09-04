package com.cs.alf.patterns.concurrency;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by root1 on 05.09.17.
 */
public class SimpleCP {
    public static void main(String[] args) {
        String[] holder = new String[1];
        new SimpleCP.Consumer(holder).start();
        new SimpleCP.Producer(holder).start();
    }

    private static class Producer extends Thread {
        private final String[] holder;

        public Producer(String[] holder) {
            this.holder = holder;
        }

        @Override
        public void run() {
                synchronized (holder) {
                    while (true){
                    while (holder[0] != null) {
                        try {
                            holder.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    holder[0] = "Hi from producer ";
                    System.out.println(holder[0]);
                    holder.notifyAll();
                }
        }}
    }

    private static class Consumer extends Thread {
        private final String[] holder;

        public Consumer(String[] holder) {
            this.holder = holder;
        }

        @Override
        public void run() {while (true){
                synchronized (holder){
                    while (holder[0] == null){
                        try {
                            holder.wait();
                        } catch (InterruptedException e) {

                        }
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String result = holder[0];
                    System.out.println("Consumer get result: " + result);
                    holder[0] = null;
                    holder.notifyAll();
            }
        }}
    }

}
