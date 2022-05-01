package com.belhard.lesson10;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 87, 8, 5, 8, 34};
        int[] array1 = {4, 6, 8};

        int p = 0;
        for (int j = 0; j < array.length; j++) {
            for (int n : array1) {
                if (array[j] == n) {
                    array[j] = 0;
                }

            }
        }
        for (int t : array) {
            if (t == 0) {
                p = p + 1;
            }
        }
        System.out.println(p);
        int[] resul = new int[array.length - p];
        System.out.println(Arrays.toString(array));
        int i = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] != 0) {
                resul[i] = array[j];
                i++;
            }
        }

        System.out.println(Arrays.toString(resul));
    }
}


