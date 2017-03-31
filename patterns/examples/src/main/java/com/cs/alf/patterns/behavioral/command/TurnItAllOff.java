package com.cs.alf.patterns.behavioral.command;

/**
 * Created by mikhail_alferov on 30.03.2017.
 */

import java.util.List;

public class TurnItAllOff implements Command {
    private List<ElectronicDevice> theDevices;

    public TurnItAllOff(List<ElectronicDevice> newDevices) {
        theDevices = newDevices;
    }
    public void execute() {
        for (ElectronicDevice device : theDevices) {
            device.off();
        }
    }

    public void undo() {
        for (ElectronicDevice device : theDevices) {
            device.on();
        }

    }
}