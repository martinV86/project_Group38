package com.belhard.lesson10;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите номер группы: ");
            int group=scanner.nextInt();
            System.out.println("Введите номер курса: ");
            int course=scanner.nextInt();
            scanner.nextLine();//(It consumes the \n character)
            System.out.println("Введите данные студета:\n Имя: ");
            String name_s = scanner.nextLine();
            System.out.println("Фамилия: ");
            String family_s = scanner.nextLine();
            System.out.println("Возраст: ");
            int age_s = scanner.nextInt();
            scanner.nextLine();//(It consumes the \n character)
            System.out.println("Город: ");
            String city_s = scanner.nextLine();
            System.out.println("Улица: ");
            String street_s = scanner.nextLine();
            System.out.println("Дом: ");
            int hous_s = scanner.nextInt();
            System.out.println("Квартира: ");
            int apartment_s = scanner.nextInt();
            Address address1=new Address(city_s,street_s,hous_s,apartment_s);
            Student student1=new Student(name_s,family_s,age_s,address1);
            scanner.nextLine();//(It consumes the \n character)
            System.out.println("Введите данные преподавателя:\n Имя ");
            String name_t = scanner.nextLine();
            System.out.println("Фамилия: ");
            String family_t = scanner.nextLine();
            System.out.println("Возраст: ");
            int age_t = scanner.nextInt();
            scanner.nextLine();//(It consumes the \n character)
            System.out.println("Город: ");
            String city_t = scanner.nextLine();
            System.out.println("Улица: ");
            String street_t = scanner.nextLine();
            System.out.println("Дом: ");
            int hous_t = scanner.nextInt();
            System.out.println("Квартира: ");
            int apartment_t = scanner.nextInt();
            Address address2=new Address(city_t,street_t,hous_t,apartment_t);
            Teacher teacher1=new Teacher(name_t,family_t,age_t,address2);
            System.out.println("Введите через  данные для расчета зарплаты преподавателя: \nОклад:");
            int salary = scanner.nextInt();
            System.out.println("премия (%):");
            int premium = scanner.nextInt();
            System.out.println("количество рабочих дней:");
            int working_days = scanner.nextInt();
            System.out.println("количество фвктически отработанных дней:");
            int days_worked = scanner.nextInt();
            teacher1.money(salary,premium,working_days,days_worked);
            Group group1=new Group(group,course,student1,teacher1);
            group1.displayInfo();
        }
    }
