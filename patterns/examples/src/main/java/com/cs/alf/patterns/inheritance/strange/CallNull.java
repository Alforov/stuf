package com.cs.alf.patterns.inheritance.strange;

/**
 * Created by root1 on 19.08.17.
 */
public class CallNull {

    public static void  test(){
        System.out.println("Hello world!");
    }

    public static void main(String[] args) {
        CallNull callNull = null;
        callNull.test();
        
        Integer i = new Integer(null);
    }
}
