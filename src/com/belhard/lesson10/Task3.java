package com.belhard.lesson10;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите сумму вклада");
        float sum = scanner.nextInt();
        System.out.println("Укажите количество месяцев");
        int mos = scanner.nextInt();
        double p = 0.07; //проценты
        double res = sum;//итоговая сумма
        for (int i = 1; i <= mos; i++) {
            res = res + (res * p * i);
        }
        System.out.println("По окончанию " + mos + " месяцев Ваш вклад составит: " + res);
    }
}