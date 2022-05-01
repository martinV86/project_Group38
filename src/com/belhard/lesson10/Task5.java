package com.belhard.lesson10;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите  строку");
        Scanner scanner = new Scanner(System.in);
        StringBuilder a1 = new StringBuilder(scanner.nextLine());

        for (int i = 0; i < a1.length(); i++) {
            if (i == a1.indexOf(" ")) {
                a1.replace(i, i + 1, "");
                i++;
            }


        }
        System.out.println(a1);
    }
}