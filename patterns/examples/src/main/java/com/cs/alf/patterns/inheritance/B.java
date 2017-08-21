package com.cs.alf.patterns.inheritance;

/**
 * Created by root1 on 22.04.17.
 */
public class B extends A
{
    public static String b = "it's b static field";
    static {
        b = "it's b static field!!!!!!!!1";
        System.out.println(b);
    }
    public String oB="is ob ";
    public B() {
        super(b);
        System.out.println(oB);
        System.out.println("construct B");
    }

    @Override
    public String test() throws RuntimeException {
        A a = new B();
        test3(a);
        return null;
    }

    @Override
    public void test1(String a1, String t2) {
        super.test1(a1,t2);
    }
    public void test3(A a) {
        System.out.println(a);
    }
    public void test3(B a) {
        System.out.println(a);
    }
}
