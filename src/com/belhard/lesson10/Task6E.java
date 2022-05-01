package com.belhard.lesson10;

import java.util.Scanner;

class Task6E {
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
            for (int b=0; b<nums.length-1; b++){
                if(nums[b]>nums[b+1]){
                    int t=nums[b];
                    nums[b]=nums[b+1];
                    nums[b+1]=t;

                }
            }

        }
        System.out.println("отсортированные числа: ");
        for (int r=0; r<nums.length; r++)
            System.out.print(" " + nums[r]);
    }

}

