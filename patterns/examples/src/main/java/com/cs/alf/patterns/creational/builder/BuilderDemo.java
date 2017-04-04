package com.cs.alf.patterns.creational.builder;

/**
 * Created by mikhail_alferov on 04.04.2017.
 */
public class BuilderDemo {
    public static void main(String[] args) {
        House.Builder builder = House.newBuilder();
        builder.putBase("concrete base");
        builder.putWalls("wood walls");
        builder.putRoof("iron roof");
        House house = builder.build();
        System.out.println(house);

    }
}
