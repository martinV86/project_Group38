package com.belhard.lesson10;

import model.Dog;
import model.Raccon;
import util.Converter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Raccon_Dog {
        public static void main(String[] args) {
            Function<Integer, String> convector = el -> el.toString();
            int age = 45;
            String ageStr = convector.apply(age);
// или
// Converter<String,Integer> converter=el -> el.toString(); //шаблон как должно конвертироваться. -> -лямбда
// int age=45;
// String ageStr=converter.convert(возраст);

            Converter<Raccon, Dog> dogConverter = dog -> new Raccon(dog.getName(), dog.getAge(), dog.getWage(), "Серый");
            Dog dog = new Dog("Шарик", 5, 10);
            Raccon raccon = dogConverter.convert(dog);
            System.out.println(raccon.getName() + " " + raccon.getAge() + " " + raccon.getWage() + " " + raccon.getColor());
// int c=5;
// Объект o;
// String b = "for";
// печать (b);
// печать (c);
//    }
//
// public static void print(Object o) {
// System.out.println(o);

//Поток
            List<String> strings = new ArrayList<>();
            strings.add("новый");
            strings.add("привет");
            strings.add("да");
            //отфильтровать значения с длинной 3
// strings.stream()
// .filter(s -> s.length() == 3)
// .forEach(s -> System.out.println(s));
            Stream<String> listStrem=strings.stream()
                    .filter(s -> s.length() == 3);
            listStrem.forEach(s -> System.out.println(s));


            List<Dog>dogs=new ArrayList<>();
            dogs.add(dog);
            List<Raccon>racconList=dogs.stream()
                    .map(dog1 -> dogConverter.convert(dog1))
                    .collect(Collectors.toList());
// racconList.forEach();

        }
    }

