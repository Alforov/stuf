package com.cs.alf.patterns.behavioral.template;

/**
 * Created by mikhail_alferov on 31.03.2017.
 */
public class Client {
    public static void main(String[] args) {
        CrossCompiler iphone = new IPhoneCompiler();
        iphone.crossCompile();
        CrossCompiler android = new AndroidCompiler();
        android.crossCompile();
    }
}