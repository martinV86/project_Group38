package com.belhard.lesson10;

public class Task4 {
    public static void main(String[] args) {
        String str = "25+40=65";
        StringBuilder sb = new StringBuilder(str);
        getRez(sb);
        getReplacement(sb);
    }
    public static void getRez(StringBuilder string){
        string.insert(6," равно ");
        string.deleteCharAt(5);
        System.out.println(string);
    }
    public static void getReplacement(StringBuilder string){
        string.replace(6,11,"равно");
        System.out.println(string);

    }
}
