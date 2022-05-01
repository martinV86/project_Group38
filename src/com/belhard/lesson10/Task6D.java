package com.belhard.lesson10;

import java.util.Scanner;

public class Task6D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество целых чисел n= ");
        int n = scanner.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("введите число: ");
            nums[i] = scanner.nextInt();
        }

        for (int x : nums){
            if(x/100>1 && x/1000<1){
                int a= x/100;
                int b=(x-a*100)/10;
                int c=(x-a*100-b*10)/10;
                if(a!=b && b!=c && c!=a){

                }
                System.out.println(x);
            }
        }
    }
}
