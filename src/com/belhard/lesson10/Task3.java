package com.belhard.lesson10;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int array[] = new int [118];
        Random random=new Random(0);
        for (int i = 0; i < array.length; i++) {
            array[i]= random.nextInt(3,120);

            System.out.print(" "+array[i] + " ");
        }
        System.out.println();
        System.out.println("непростые числа: ");
        for (int i=0; i<array.length;i++){
            if (array[i]%2==0||array[i]%3==0||array[i]%5==0||array[i]%7==0){
                System.out.print(" "+array[i]+" ");
            }
        }
    }
}

