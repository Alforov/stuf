package com.cs.alf.patterns.concurrency;


import java.util.*;

/**
 * Created by mikhail_alferov on 07.04.2017.
 */
public class Trash {
    public static void main(String[] args) {
     String target = "hello buy hello buy remote !!";
        String[] split = target.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String s : split) {
            if(map.containsKey(s)){
                map.put(s, map.get(s)+ 1);
            }else {
                map.put(s,1);
            }
        }
        Integer t =null;
        Integer c = 4;
        if(t>c){
            System.out.println("------------------");
        }
        ArrayList<Map.Entry<String,Integer>> entries = new ArrayList<>();
        entries.addAll(map.entrySet());
        Collections.sort(entries, (o1, o2) -> {
            if(o1.getValue() == null || o1.getValue()<o2.getValue()) return -1;
            if(o1.getValue().equals(o2.getValue())) return 1;
            return 0;
        });
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.printf("count %s value: %s\n" ,entry.getValue(),entry.getKey());
        }


    }
}
