package com.cs.alf.patterns.concurrency.frombook.monitorvehicletracker;

/**
 * Created by root1 on 05.09.17.
 */
public class MutablePoint {
    public int x, y;
    public MutablePoint() { x = 0; y = 0; }
    public MutablePoint(MutablePoint p) {
        this.x = p.x;
        this.y = p.y;
    }
}