package com.belhard.lesson10;

import java.util.Scanner;

public class Task6F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество целых чисел n= ");
        int n = scanner.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("введите число: ");
            nums[i] = scanner.nextInt();
        }
        for (int a=0; a<nums.length; a++){
            String t=String.valueOf(nums[a]);
            for(int b=0; b<t.length()/2;b++){
                for (int c=t.length()-1;c>t.length()/2;c--){
                    if (t.charAt(b)!=t.charAt(c)){
                        continue;
                    }
                    System.out.print(" "+t);
                    break;
                }
            }
        }
    }
}

