package com.cs.alf.patterns.behavioral.iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * Created by root1 on 28.03.17.
 */
public class IteratorTest {
    public static void main(String[] args) {
        IterableEntity<Integer> integers = new IterableEntity<Integer>();
        Integer[] a = integers.getA();
        Random random = new Random();
        for(int i =0; i<a.length;i++){
            a[i] = random.nextInt();
        }
        for (Integer integer : integers) {
            System.out.println("result from iterator:" + integer);
        }


        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add(null);
        strings.add("4");
        Iterator iterator = strings.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("befor " + strings.size());
            iterator.remove();
            System.out.println("after" + strings.size());
        }
        System.out.println("------");
        System.out.println(strings.size());
        //    System.out.println(strings.get(1));
    }
}
