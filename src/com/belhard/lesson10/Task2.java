package com.belhard.lesson10;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        Random random=new Random();
        for (int i=0;i<10;i++) {
            arrayList.add(random.nextInt(0,1000));
        }

        System.out.println(arrayList);

    }
}