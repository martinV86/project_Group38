package com.belhard.lesson10;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Введите  строку");
        Scanner scanner = new Scanner(System.in);
        StringBuilder a1 = new StringBuilder(scanner.nextLine());
        String str= String.valueOf(a1);
        String[]mas=str.split("\\s*(\\s|,|!|-|\\.)\\s*");
        int p=0;
        for (String n:mas){
            System.out.println(n);
            p=p+1;
        }
        System.out.println(p);
    }

}