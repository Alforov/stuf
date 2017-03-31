package com.cs.alf.patterns.behavioral.command;

/**
 * Created by mikhail_alferov on 30.03.2017.
 */
public interface Command {

    public void execute();

    // You may want to offer the option to undo a command

    public void undo();

}