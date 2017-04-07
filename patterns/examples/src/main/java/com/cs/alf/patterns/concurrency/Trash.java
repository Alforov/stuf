package com.cs.alf.patterns.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Created by mikhail_alferov on 07.04.2017.
 */
public class Trash {
    public static void main(String[] args) {
        try {
            TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("the end");
    }
}
