package com.cs.alf.patterns.concurrency.frombook;

/**
 * Created by root1 on 03.09.17.
 */
public class NoVisibility {
    private static boolean ready;
    private static int number;
    private static class ReaderThread extends Thread {
        public void run() {
            while (!ready){
                Thread.yield();}
            System.out.println(number);
        }
    }
    public static void main(String[] args) {
        new ReaderThread().start();
        number = 42;
        ready = true;
    }
}
