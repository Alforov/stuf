package com.cs.alf.patterns.concurrency;


import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by mikhail_alferov on 07.04.2017.
 */
public class Trash {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("#hello #buy #hello #hello #buy remote !!", "#hello #buy #hello #hello #buy remote !!", "#hello #buy #hello #hello #buy remote !!", "#hello #buy #hello #hello #buy remote !!");
        strings.stream().peek((it) -> System.out.println("it"));

    }
}
