package com.cs.alf.patterns.structural.facade;

/**
 * Created by mikhail_alferov on 03.04.2017.
 */
public class PCFacade {
    private CPU cpu;
    private Memory memory;
    private ETC etc;

    public PCFacade() {
        cpu = new CPU();
        memory = new Memory();
        etc = new ETC();
    }

    public void start() {
        cpu.start();
        memory.start();
        etc.start();
        System.out.println("PC is started !! ");
    }
}
