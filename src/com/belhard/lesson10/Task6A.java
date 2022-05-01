package com.belhard.lesson10;

import java.util.Scanner;

public class Task6A {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("введите количество целых чисел n= ");
        int n=scanner.nextInt();
        int nums[]=new int[n];
        for (int i=0;i<nums.length;i++){
            System.out.println("введите число: ");
            nums[i]=scanner.nextInt();
        }
        for (int a : nums){
            if(a%2==0){
                System.out.println("четное число: "+a);
            }else{
                System.out.println("не четное число "+a);
            }
        }
    }
}
