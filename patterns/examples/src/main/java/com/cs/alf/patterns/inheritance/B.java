package com.cs.alf.patterns.inheritance;

/**
 * Created by root1 on 22.04.17.
 */
public class B extends A
{
    public static String b = "it's b static field";
    static {
        b = "it's b static field";
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
        return "";
    }
}
