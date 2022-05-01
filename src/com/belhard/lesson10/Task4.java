package com.belhard.lesson10;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите сумму вклада");
        float sum = scanner.nextInt();
        System.out.println("Укажите количество месяцев");
        int mos = scanner.nextInt();
        double p = 0.07; //проценты
        double res = sum;//итоговая сумма
        int i = 1;
        while (i <= mos) {
            res = res + (res * p * i);
            i++;
        }
        System.out.println("По окончанию " + mos + " месяцев Ваш вклад составит: " + res);
    }
}
