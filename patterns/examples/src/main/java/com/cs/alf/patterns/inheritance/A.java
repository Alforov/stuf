package com.cs.alf.patterns.inheritance;

/**
 * Created by root1 on 22.04.17.
 */
public class A
{
    public static String a;
    static {
        a = "it's a static field";
        System.out.println(a);
    }
    public String oA="is oa ";

    public A() {
        System.out.println(oA);
        System.out.println("construct a");
    }
    public A(String helloFromB){
        System.out.println("----------");
        System.out.println(oA);
        System.out.println(helloFromB);
    }

    public String test() throws Exception{
        return null;
    }
}
