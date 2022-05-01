package com.belhard.lesson10;

import java.util.Scanner;

public class Task5A {

    public static void main(String[] args) {
        System.out.println("Введите Ваше имя");
        Scanner name =new Scanner(System.in);
        System.out.println("Hello" + name.nextLine());
    }
}

