package com.belhard.lesson10;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        Random random=new Random();
        for (int i=0;i<10;i++){
            arrayList.add(random.nextInt(25,500));
            System.out.println(arrayList.get(i));
        }
        System.out.println("Отсортированный массив");
        arrayList.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
