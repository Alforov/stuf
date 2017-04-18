package com.cs.alf.patterns.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Created by mikhail_alferov on 07.04.2017.
 */
public class Trash {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        Integer integer = Integer.valueOf("26001306255838");
        try {
            TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("the end");
    }
}
