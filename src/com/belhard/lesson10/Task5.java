package com.belhard.lesson10;

public class Task5 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(j + " х " + i + " = " + j * i);
            }
            System.out.println();
        }
    }
}