package com.belhard.lesson10;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Введите  строку");
        Scanner scanner = new Scanner(System.in);
        StringBuilder a1 = new StringBuilder(scanner.nextLine());
        int p=0;
        for (int i = 0; i < a1.length(); i++) {
            for (int j=1;j<a1.length();j++){
                if(i==j){
                    p=p+1;
                    i++;j++;
                }
            }
        }
        System.out.println(p);
    }
}
