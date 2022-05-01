package com.belhard.lesson10;

public class Task2 {
    public static void main(String[] args) {
        double x = 10000000.0;//население
        double y = 0.014;//рождаемость на 1000 человек
        double z = 0.008; //смертность на 1000 человек
        double people = x;
        for (int years = 1; years <= 10; years++) {
            double p = people + people * y - people * z;
            people = p;
        }
        System.out.println(Math.round(people));
    }
}