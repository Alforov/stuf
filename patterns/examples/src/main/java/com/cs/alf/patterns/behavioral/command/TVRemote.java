package com.cs.alf.patterns.behavioral.command;

/**
 * Created by mikhail_alferov on 30.03.2017.
 */
public class TVRemote {
    public static ElectronicDevice getDevice() {
        return new Television();
    }

}