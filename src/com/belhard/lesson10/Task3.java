package com.belhard.lesson10;

import java.util.Scanner;

public class Task3 {
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
        getWith(str1,str2);
        getCar(a1,a2);
    }
    public static boolean getWith(String str1,String str2){
        if(str1.endsWith(str2)){
            System.out.println("подстроки совпадают");
            return true;
        }else{
            System.out.println("подстроки не совпадают");
            return false;
        }
    }
    public static void getCar(StringBuffer str1, StringBuffer str2){
        int index1 = str1.indexOf("Я");
        int index2=str2.indexOf("Я");
        if(index1>=0&&index2>=0){
            System.out.println("символ Я существует в обоих строках");
        }else {
            System.out.println("символ Я не существует в обоих строках");
        }
    }
}

