package com.cs.alf.patterns.behavioral.command;

/**
 * Created by mikhail_alferov on 30.03.2017.
 */
public class DeviceButton {
    Command theCommand;

    public DeviceButton(Command newCommand) {
        theCommand = newCommand;
    }

    public void press() {
        theCommand.execute();
    }

    public void pressUndo() {
        theCommand.undo();
    }

}