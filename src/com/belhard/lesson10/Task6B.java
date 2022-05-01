package com.belhard.lesson10;

import java.util.Scanner;

public class Task6B {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("введите количество целых чисел n= ");
        int n=scanner.nextInt();
        int nums[]=new int[n];
        for (int i=0;i<nums.length;i++){
            System.out.println("введите число: ");
            nums[i]=scanner.nextInt();
        }
        int max =nums[0];
        int min=nums[0];
        for (int x:nums){
            if (x<min) min=x;
            if(x>max) max=x;
        }
        System.out.println("Максимальное число: "+max);
        System.out.println("Максимальное число: "+min);

    }
}
