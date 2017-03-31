package com.cs.alf.patterns.behavioral.command;

/**
 * Created by mikhail_alferov on 30.03.2017.
 */
public class TurnTVOff implements Command {
    ElectronicDevice theDevice;
    public TurnTVOff(ElectronicDevice newDevice){
        theDevice = newDevice;
    }

    public void execute() {
        theDevice.off();
    }
    public void undo() {

        theDevice.on();

    }

}
