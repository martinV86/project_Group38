package com.belhard.lesson10;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("массив 1");
        int array[] = new int [15];
        Random random=new Random(0);
        for (int i = 0; i < array.length; i++) {
            array[i]= random.nextInt(1000);

            System.out.println(array[i] + " ");
        }

        Quicksort.qsort(array);
        System.out.println("отсортированный массив 1 (быстрая сортировка");
        for (int n:array){
            System.out.println(n);
        }
        System.out.println("массив 2");
        int array1[] = new int [15];
        Random random1=new Random(0);
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random1.nextInt(1000);

            System.out.println(array1[i] + " ");
        }


        for (int i=1;i<array1.length;i++){
            int current=array1[i];
            int j=i;
            while (j > 0 && array1[j-1]>current) {
                array1[j]=array1[j-1];
                j--;

            }
            array1[j]=current;
        }
        System.out.println("отсортированный массив 2 (сортировка вставкой");
        for (int n:array1) {
            System.out.println(n);
        }
    }



}

