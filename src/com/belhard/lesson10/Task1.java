package com.belhard.lesson10;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите 1 число");
        int a = scanner.nextInt();

        System.out.println("введите 2 число");
        int b = scanner.nextInt();
        if (a == b) {
            System.out.println("чмсла равны");
        } else if (a < b) {
            System.out.println("чмсло " + b + " больше числа " + a);
        } else {
            System.out.println("чмсло " + a + " больше числа " + b);
        }
    }
}