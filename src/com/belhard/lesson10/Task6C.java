package com.belhard.lesson10;

import java.util.Scanner;

public class Task6C {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("введите количество целых чисел n= ");
        int n=scanner.nextInt();
        int nums[]=new int[n];
        for (int i=0;i<nums.length;i++){
            System.out.println("введите число: ");
            nums[i]=scanner.nextInt();
        }
        for (int a : nums) {
            if (a % 3 == 0 || a % 9 == 0)
                System.out.println("чсло делится на 3 или на 9: " + a);
        }
    }
}

