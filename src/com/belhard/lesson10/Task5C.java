package com.belhard.lesson10;

import java.util.Scanner;

public class Task5C {

    public static void getprint(int nums){
        System.out.print(" "+nums+" ");

    }
    public static void getprintln(int nums){
        System.out.println(nums);

    }
    public static void main(String[] args) {
        System.out.println("Введите количество чисел");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i=0; i<n;i++) {
            int a = (int) (Math.random() * 100);
            Task5C.getprint(a);
        }
        System.out.println();
        for (int i=0; i<n;i++) {
            int a = (int) (Math.random() * 100);
            Task5C.getprintln(a);
        }
    }
}

