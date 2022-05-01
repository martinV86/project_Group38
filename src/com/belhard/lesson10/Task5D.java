package com.belhard.lesson10;

import java.util.Scanner;

public class Task5D {
    public static void main(String[] args) {
        Scanner arg  = new Scanner(System.in);
        for (int i = 0; true; i++) {
            StringBuffer argument = new StringBuffer(arg.nextLine());
            String pass = String.valueOf(argument);
            for (int a = 0; a < pass.length(); a++) {
                String admin_pass = "Hi";
                if (pass.equals(admin_pass)&& pass.length() == admin_pass.length()) {
                    System.out.println("Приветствую!");
                    break;
                } else {
                    System.out.println("Пароль не верный");
                    break;
                }
            }
        }
    }
}