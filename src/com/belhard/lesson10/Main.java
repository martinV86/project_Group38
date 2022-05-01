package com.belhard.lesson10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {


//        TreeMap

        TreeSet<String>treeSet=new TreeSet<>();
        treeSet.add("qwerti");
        treeSet.add("hello");
        treeSet.forEach(s-> System.out.println(s));
        String str="Heelo";
        System.out.println(str.hashCode());

//        HashMap

        HashMap<String,String>map=new HashMap<>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        map.put("key2","value22");
//
        System.out.println(map.get("key2"));
        map.entrySet().forEach(entry->{
            System.out.println(entry.getKey()+" "+ entry.getValue());
        });
//        LinkedHashMap linkedHashMap=new LinkedHashMap<>(); //сохраняет последовательность

    }
}
