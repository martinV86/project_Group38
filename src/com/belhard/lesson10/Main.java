package com.belhard.lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ArrayList<Associate> associates = new ArrayList<>(Arrays.asList(
                new Associate("Иван", 40, 5000, "инженер"),
                new Associate("Снежанна", 35, 5000, "инженер"),
                new Associate("Егор", 35, 4500, "инженер"),
                new Associate("Людмила", 20, 2000, "техник"),
                new Associate("Ирина", 21, 2000, "техник"),
                new Associate("Сергей", 25, 4000, "системный администратор"),
                new Associate("Маргарита", 65, 1800, "уборщик"),
                new Associate("Петр", 45, 6000, "руководитель группы"),
                new Associate("Яков", 50, 15000, "главный инженер"),
                new Associate("Александр", 41, 25000, "директор")));

//        System.out.println(associates);
        associates.stream()
                .filter(s -> s.getName().indexOf("И") == 0)
                .forEach(s -> System.out.println(s));


    }
}
