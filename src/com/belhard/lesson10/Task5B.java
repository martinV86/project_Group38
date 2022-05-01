package com.belhard.lesson10;

import java.util.Scanner;

public class Task5B {
    public static void main(String[] args) {
        Scanner arg = new Scanner(System.in);
        for (int i = 0; true; i++) {
            StringBuffer argument=new StringBuffer(arg.nextLine());
            argument.reverse();
            System.out.println("зеркальный аргумент:  "+argument.toString());
        }
    }
}