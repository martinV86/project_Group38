package com.belhard.lesson10;

import java.util.Scanner;

public class Task1_2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите челое число");
        int num=scanner.nextInt();
        System.out.println(i_Sum(num));
    }
    static int i_Sum(int n){
        if(n==1){
            return 1;
        }
        return n%10+i_Sum(n/10);
    }
}
