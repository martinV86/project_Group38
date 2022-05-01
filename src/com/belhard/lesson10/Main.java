package com.belhard.lesson10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            Address address1 = new Address("Минск", "Аэродромная", 28, 127);
            Student student1 = new Student("Василий", "Мартин", 35, address1);
            Address address2 = new Address("Минск", "Олешева", 3, 249);
            Student student2 = new Student("Александр", "Мартин", 9, address2);
            Address address3 = new Address("Минск", "Якуба Колоса", 40, 49);
            Student student3 = new Student("Сергей", "Мартин", 4, address3);
//        scanner.nextLine();//(It consumes the \n character)
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
            Address address = new Address(city_t, street_t, hous_t, apartment_t);
            Teacher teacher1 = new Teacher(name_t, family_t, age_t, address);
            System.out.println("Введите через  данные для расчета зарплаты преподавателя: ");
            System.out.println(" Оклад:");
            int salary = scanner.nextInt();
            System.out.println("количество рабочих дней:");
            int working_days = scanner.nextInt();
            System.out.println("количество фвктически отработанных дней:");
            int days_worked = scanner.nextInt();
            System.out.println("предусмотрена ли премия? 1-да/2-нет):");
            scanner.nextLine();//(It consumes the \n character)
            int ipremium = scanner.nextInt();
            if (ipremium == 1) {
                System.out.println(" премия (%):");

                int premium = scanner.nextInt();
                teacher1.money(salary, premium, working_days, days_worked);
            } else {
                teacher1.money(salary, working_days, days_worked);
            }
            Student[] students = new Student[3];
            students[0] = student1;
            students[1] = student2;
            students[2] = student3;
            Group group1 = new Group(38, 1, students, teacher1);

            System.out.println(group1.displayInfo());
            group1.stInfo();
            System.out.println("Укажите действие: 1 - добавть студента; 2 -отчислить студетна");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Address address4 = new Address("Минск", "Нововиленская", 24, 24);
                    Student student4 = new Student("Вероника", "Мартин", 35, address4);
                    group1.newStudent(student4);
                    break;
                case 2:
                    System.out.println("Укажите студента  которого требуется отчислить? 1." + student1.getName() + " 2. " + student2.getName() + " 3. " + student3.getName());
                    int st_dell = scanner.nextInt();
                    group1.dellit(st_dell);
                    break;
            }
        }
    }

