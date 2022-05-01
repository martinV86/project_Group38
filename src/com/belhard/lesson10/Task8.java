package com.belhard.lesson10;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите строку");
        String str=scanner.nextLine();
        String[]mas=str.split("");
        for (int i=mas.length-1;i>=0;i--){
            System.out.print(mas[i]);
        }

    }

}