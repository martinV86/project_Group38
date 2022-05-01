package com.belhard.lesson10;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        double Array[] = new double[15];

        for (int i = 0; i < Array.length; i++) {

            Array[i] = Math.random();
            System.out.println(Array[i] + " ");
        }
        double max =Array[0];
        double min=Array[0];
        double average =0;
        double sum =0;
        for (int i = 0; i < Array.length; i++) {

            if (max < Array[i])
                max = Array[i];

            if (min > Array[i])
                min = Array[i];
            sum += Array[i];

        }
        average=sum/ Array.length;
        System.out.println("Максимальное значение:"+max+", минимальное значение: "+min+", среднее значение: "+average);
    }
}

