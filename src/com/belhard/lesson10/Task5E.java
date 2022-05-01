package com.belhard.lesson10;

import java.util.Scanner;

public class Task5E {
    public static void main(String[] args) {
        Scanner num  = new Scanner(System.in);
        for (int i = 0; true; i++) {
            System.out.println("Введите 1 целое число");
            int a = num.nextInt();
            System.out.println("Введите 2 целое число");
            int b = num.nextInt();
            System.out.println("сумма: " + (a+b)+" ");
            System.out.println();
            System.out.println("произведение: " + (a*b)+" ");
            break;
        }
    }
}
