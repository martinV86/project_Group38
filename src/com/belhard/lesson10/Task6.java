package com.belhard.lesson10;


import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = 0;
        while (c != 1) {
            System.out.println("введите 1 число:");
            int a = scanner.nextInt();
            System.out.println("введите 2 число:");
            int b = scanner.nextInt();
            System.out.println("результат: " + (a * b));
            System.out.println("для завершения работы введите 1");
            c = scanner.nextInt();
        }
    }
}