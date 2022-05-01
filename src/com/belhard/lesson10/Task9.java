package com.belhard.lesson10;

public class Task9 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("главрыба");
        char[] mas = new char[sb.length()];
        for (int j = 0, i = sb.length() - 1; i >= 0; j++, i--) {
            mas[j] = sb.charAt(i);

        }

        System.out.println(mas);
    }
}
