package com.cs.alf.patterns.behavioral.chainofresponsibility;

/**
 * Created by mikhail_alferov on 29.03.2017.
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
