package com.belhard.lesson10;

public class Task1 {
    public static void main(String[] args) {
        String massNum1 = "Я изучаю Java";
        String massNum2 = "скоро стану программистом";
        System.out.println(getNum(massNum1));
        System.out.println(getNum2(massNum2));
    }
    public static char getNum(String str1) {
        char a = str1.charAt(0);
        return a;
    }
    public static char[] getNum2(String str2) {
        char[] massCar = new char[19];
        str2.getChars(6, 25, massCar, 0);

        return massCar;
    }
}