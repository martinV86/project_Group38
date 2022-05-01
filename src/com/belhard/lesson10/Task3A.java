package com.belhard.lesson10;

public class Task3A {
    public static void main(String[] args) {
        int x = 6;
        if ((x <= 10) && (x != 5)) {
            switch (x) {
                case 6:
                    System.out.println("число равно 6");
                    break;
                case 7:
                    System.out.println("число равно 7");
                    break;
                case 8:
                    System.out.println("число равно 8");
                    break;
                default:
                    System.out.println("число входит в диапозон");

            }
        } else {
            System.out.println("число не входит в диапозон");
        }
    }
}
