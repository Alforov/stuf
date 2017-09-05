package com.cs.alf.patterns.concurrency.frombook.monitorvehicletracker;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by root1 on 05.09.17.
 */
public class DelegatingVehicleTracker {
    private final ConcurrentMap<String, Point> locations;
    public DelegatingVehicleTracker(Map<String, Point> points) {
        locations = new ConcurrentHashMap<String, Point>(points);
    }
    public Point getLocation(String id) {
        return locations.get(id);
    }
    public void setLocation(String id, int x, int y) {
        if (locations.replace(id, new Point(x, y)) == null)
            throw new IllegalArgumentException(
                    "invalid vehicle name: " + id);
    }
    public Map<String, Point> getLocations() {
        return Collections.unmodifiableMap(
                new HashMap<String, Point>(locations));
    }
}
