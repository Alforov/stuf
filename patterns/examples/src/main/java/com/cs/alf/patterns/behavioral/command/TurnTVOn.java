package com.cs.alf.patterns.behavioral.command;

/**
 * Created by mikhail_alferov on 30.03.2017.
 */
public class TurnTVOn implements Command {

    ElectronicDevice theDevice;

    public TurnTVOn(ElectronicDevice newDevice) {

        theDevice = newDevice;

    }

    public void execute() {

        theDevice.on();

    }

    public void undo() {

        theDevice.off();

    }

}