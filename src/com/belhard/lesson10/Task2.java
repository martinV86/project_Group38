package com.belhard.lesson10;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите 1 строку");
        Scanner scanner=new Scanner(System.in);
        StringBuffer a1=new StringBuffer(scanner.nextLine());
        System.out.println("Введите 2 строку");
        StringBuffer a2=new StringBuffer(scanner.nextLine());
        char[] mas1=new char[5];
        a1.getChars(a1.length()-5, a1.length(),mas1,0);
        char[] mas2=new char[5];
        a2.getChars(a2.length()-5, a2.length(),mas2,0);
        System.out.println("сравниваемые подстроки: ");
        System.out.println(mas1);
        System.out.println(mas2);
        String str1=new String(mas1);
        String str2=new String(mas2);
        System.out.println("равнение с учётом регистра: ");
        System.out.println(getStr(str1,str2));
        System.out.println("равнение без учёта регистра: ");
        System.out.println(getSrtNew(str1,str2));

    }
    public static boolean getStr(String str1,String str2){
        if(str1.equals(str2)){
            System.out.println("Последние 5 символов совпадают");
            return true;
        }else {
            System.out.println("Последние 5 символов не совпадают");
            return false;
        }
    }
    public static boolean getSrtNew(String str1,String str2) {
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Последние 5 символов совпадают");
            return true;
        } else {
            System.out.println("Последние 5 символов не совпадают");
            return false;
        }
    }
}

