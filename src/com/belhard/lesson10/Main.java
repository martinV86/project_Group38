package com.belhard.lesson10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        setArray(arrayList);
        System.out.println();
        setLinked(linkedList);
        System.out.println();
        getArray(arrayList);
        System.out.println();
        getLinked(linkedList);

    }
    public static ArrayList setArray(ArrayList arrayList){
        long start=System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        System.out.println();
        long stop1=System.currentTimeMillis()-start;
        System.out.println("Время выполнения setArray: "+stop1);
        return arrayList;
    }
    public static LinkedList setLinked(LinkedList linkedList){
        long start=System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        long stop3=System.currentTimeMillis()-start;
        System.out.println("Время выполнения setLinked: "+stop3);
        return linkedList;
    }
    public static void getArray(ArrayList arrayList) {
        long start=System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            System.out.println(arrayList.get(random.nextInt(arrayList.size())));
        }
        long stop2=System.currentTimeMillis()-start;
        System.out.println("Время выполнения getArray: "+(stop2));


    }

    public static void getLinked(LinkedList linkedList) {
        long start=System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            System.out.println(linkedList.get(random.nextInt(linkedList.size())));
        }
        long stop4=System.currentTimeMillis()-start;

        System.out.println("Время выполнения getLinked: "+stop4);

    }

}
